package shepherd.api.config;

/**
 * Each define configuration need an instance of this class to control how config can change
 */
public interface ConfigurationChangeController {


    /**
     * This method call to check if possible to change value of config
     * @param config related config
     * @param confName configuration full name.
     * @param currentVal current value of config
     * @param newVal new value to set
     * @return result of change operation
     */
    ConfigurationChangeResult approveChange(IConfiguration config,
                                            ConfigurationKey confName,
                                            Object currentVal,
                                            Object newVal);
}
