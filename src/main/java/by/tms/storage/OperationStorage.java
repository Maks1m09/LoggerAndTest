package by.tms.storage;

import by.tms.entity.Operation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OperationStorage {
    List<Operation> operations = new ArrayList<>();
    private static final Logger logger = LogManager.getLogger(UserStorage.class);

    public void save (Operation operation) {
        logger.debug("method is executed save in OperationStorage");
        operations.add(operation);
    }

    public List<Operation> getAll() {
        logger.debug("method is executed getAll in OperationStorage");
        return new ArrayList<>(operations);
    }
}
