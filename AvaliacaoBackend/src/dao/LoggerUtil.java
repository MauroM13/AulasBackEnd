package dao;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;


public class LoggerUtil {
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

    public static Logger getLogger() {
        return logger;
    }
}public class FilialService {
    private FilialDAO filialDAO;
    private Logger logger = LoggerUtil.getLogger();


    public void cadastrarFilial(Filial filial) {
        // Lógica de cadastro da filial...

        filialDAO.salvar(filial);

        logger.info("Filial cadastrada: " + filial.getNome());
    }
}