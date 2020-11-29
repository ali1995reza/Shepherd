package shepherd.api.config;

/**
 * This class used to listen to events related to configs
 */
public interface ConfigChangeListener {

    /**
     * When a configuration has been changed this method will call
     * @param key related configuration
     * @param old old value of config
     * @param newValue new value of config
     */
    void onConfigChanged(ConfigurationKey key, Object old, Object newValue);

    /**
     * When a configuration has been removed this method will call
     * @param key removed configuration
     * @param removed the value of remove config
     */
    void onConfigRemoved(ConfigurationKey key, Object removed);

    /**
     * When a configuration has been defined this method will call
     * @param key defined configuration
     * @param defaultValue default value of config
     */
    void onConfigDefined(ConfigurationKey key, Object defaultValue);

    /**
     * When a configuration has been set this method will call.
     * This method just call when old value was null
     * @param key related configuration
     * @param set value
     */
    void onConfigSet(ConfigurationKey key, Object set);
}
