package ma.oncf.market.conroller;

import ma.oncf.market.exception.MarketAdministratorAlreadyExistException;
import ma.oncf.market.model.entities.MarketAdministrator;
import ma.oncf.market.model.repositories.MarketAdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marketAdministrator")
public class MarketAdministratorController {

    @Autowired
    MarketAdministratorRepository marketAdministratorRepository;

    @GetMapping("/list")
    public List<MarketAdministrator> listMarkets()
    {
        return marketAdministratorRepository.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity addMarket(@RequestBody MarketAdministrator marketAdministrator)
    {
//        Optional<MarketAdministrator> optionalMarket = marketAdministratorRepository.findByUsername(marketAdministrator.getUser().getUsername());
//        if(optionalMarket.isPresent())
//            throw new MarketAdministratorAlreadyExistException("Market Administrator exists");

        marketAdministratorRepository.save(marketAdministrator);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{marketAdministratorId}")
    public ResponseEntity deleteMarket(@PathVariable String marketAdministratorId)
    {
        marketAdministratorRepository.deleteById(marketAdministratorId);
        return ResponseEntity.ok().build();
    }


    @PutMapping("/modify")
    public ResponseEntity modifyMarket(@RequestBody MarketAdministrator marketAdministrator)
    {
        marketAdministratorRepository.save(marketAdministrator);
        return ResponseEntity.ok().build();
    }




}
