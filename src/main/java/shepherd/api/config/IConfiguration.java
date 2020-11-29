package shepherd.api.config;

/**
 * This class use to create a configuration
 */
public interface IConfiguration {

    /**
     * To create new configuration
     * @param key new config key
     * @param defaultValue default value of config
     * @param controller config controller
     * @param <T> type of config
     * @return true if configuration defined successfully and false if not
     */
    <T> boolean defineConfiguration(ConfigurationKey<T> key, T defaultValue, ConfigurationChangeController controller);

    /**
     * Set value for config using configuration key
     * @param confKey related config
     * @param value new value to set
     * @param <T> type of config
     * @return config change operation result
     * @see ConfigurationChangeResult
     */
    <T> ConfigurationChangeResult<T> set(ConfigurationKey<T> confKey, T value);

    /**
     * Set value for config using configuration key
     * @param config related config by name
     * @param value new value to set
     * @param <T> type of config
     * @return config change operation result
     * @see ConfigurationChangeResult
     */
    <T> ConfigurationChangeResult<T> set(String config, T value);

    /**
     * get value of a config using key
     * @param confKey configuration key
     * @param <T> type of config
     * @return value of config
     */
    <T> T get(ConfigurationKey<T> confKey);

    /**
     * get value of a config using key
     * @param confKey configuration key
     * @param defaultValue return this value if current value is null
     * @param <T> type of config
     * @return value of config
     */
    <T> T get(ConfigurationKey<T> confKey, T defaultValue);

    /**
     * get value of a config using key name
     * @param configName configuration name
     * @param <T> type of config
     * @return value of config
     */
    <T> T get(String configName);

    /**
     * get value of a config using key name
     * @param configName configuration name
     * @param defaultValue return this value if current value is null
     * @param <T> type of config
     * @return value of config
     */
    <T> T get(String configName, T defaultValue);

    /**
     * remove a config
     * @param confKey configuration key
     * @param <T> type of config
     * @return true if removed successfully and false if not
     */
    <T> boolean remove(ConfigurationKey<T> confKey);

    /**
     * add new configuration event listener
     * @param listener new configuration , can't be null
     */
    void addConfigChangeListener(ConfigChangeListener listener);

    /**
     * remove configuration event listener
     * @param listener configuration listener that want to remove
     */
    void removeConfigChangeListener(ConfigChangeListener listener);

    /**
     * create new sub-configuration under current configuration
     * @param name name of new configuration
     * @return created configuration
     */
    IConfiguration createSubConfiguration(String name);

    /**
     * get sub-configuration under current configuration
     * @param name name of configuration
     * @return sub-configuration
     */
    IConfiguration subConfiguration(String name);

    /**
     * get name of configuration
     * @return name as String
     */
    String name();

    /**
     * convert current configuration to a undefinable config to prevent
     * define new config
     * @return undefinable configuration
     */
    IConfiguration asUndefinableConfiguration();

    /**
     * Parent of this configuration
     * @return null if there is no parent for this configuration
     */
    IConfiguration parent();
}
