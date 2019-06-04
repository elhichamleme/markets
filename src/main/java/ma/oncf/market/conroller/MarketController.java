package ma.oncf.market.conroller;

import ma.oncf.market.exception.MarketAlreadyExistException;
import ma.oncf.market.model.entities.Market;
import ma.oncf.market.model.entities.MarketAdministrator;
import ma.oncf.market.model.repositories.MarketAdministratorRepository;
import ma.oncf.market.model.repositories.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/markets")
@Secured("")
public class MarketController {

    @Autowired
    MarketRepository marketRepository;

    @Autowired
    MarketAdministratorRepository marketAdministratorRepository;

    @GetMapping("/list")
    public List<Market> listMarkets()
    {
        return marketRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity addMarket(@RequestBody Market market)
    {
       Optional<Market> optionalMarket = marketRepository.findByMatricule(market.getMatricule());
       if(optionalMarket.isPresent())
           throw new MarketAlreadyExistException("Market exists");

        marketRepository.save(market);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{marketId}")
    public ResponseEntity deleteMarket(@PathVariable String marketId)
    {
        marketRepository.deleteById(marketId);
        return ResponseEntity.ok().build();
    }


    @PutMapping("/modify")
    public ResponseEntity modifyMarket(@RequestBody Market market)
    {
        marketRepository.save(market);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/addAdministrator")
    public ResponseEntity addAdministrator(@RequestBody Map<String, String> inputData)
    {
        String marketId = inputData.get("marketId");
        String marketAdministratorId = inputData.get("marketAdministratorId");

        Optional<Market> optionalMarket = marketRepository.findById(marketId);
        if(!optionalMarket.isPresent())
            throw new RuntimeException("Market doesn't exist");

        Optional<MarketAdministrator> optionalMarketAdministrator = marketAdministratorRepository.findById(marketAdministratorId);
        if(!optionalMarketAdministrator.isPresent())
            throw new RuntimeException("Market Administrator doesn't exist");

        Market market = optionalMarket.get();
        MarketAdministrator marketAdministrator = optionalMarketAdministrator.get();
        market.setMarketAdministrator(marketAdministrator);

        marketRepository.save(market);

        return ResponseEntity.ok().build();
    }



}
