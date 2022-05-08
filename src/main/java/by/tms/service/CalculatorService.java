package by.tms.service;

import by.tms.entity.Operation;
import by.tms.entity.User;
import by.tms.storage.OperationStorage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class CalculatorService {

    private static final Logger logger = LogManager.getLogger(CalculatorService.class);

    private static final OperationStorage operationStorage = new OperationStorage();

    public Double calc(double a, double b, String operand, User user) {
        logger.debug("method is executed calc");
        switch (operand) {
            case "sum": {
            return     getOperation(a, b, operand, a + b, user);
            }
            case "minus": {
            return     getOperation(a, b, operand, a - b, user);
            }
            case "divide":{
            return     getOperation(a, b, operand, a / b, user);
            }
            case "multiply": {
              return   getOperation(a, b, operand, a * b, user);
            }
        }
        return null;
    }

    public List<Operation> findAll() {
        logger.debug("method is executed findAll");
        return operationStorage.getAll();
    }

    public Double getOperation (double a, double b, String operand, double result ,User user){
        logger.debug("method is executed getOperation");
        Operation operation= new Operation( a,  b, operand, result, user);
        operationStorage.save(operation);
        return result;
    }
}
