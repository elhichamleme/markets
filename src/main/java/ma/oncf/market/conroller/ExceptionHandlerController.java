package ma.oncf.market.conroller;


import ma.oncf.market.exception.MarketAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler( MarketAlreadyExistException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)

    public Map<String, String> interpreterNotFound(Exception ex, WebRequest req) {

        Map<String, String> result =new HashMap<>();
        result.put("error", ex.getMessage());
        return result;

    }


}