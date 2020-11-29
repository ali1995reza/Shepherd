package shepherd.api.config;

/**
 * Result of change configuration value operation
 * @param <T>
 */
public interface ConfigurationChangeResult<T> {


    /**
     * To check result was success or failed
     * @return true if success and false if failed
     */
    boolean success();

    /**
     * Get error message if operation change was not success
     * @return error message as String
     */
    String error();

    /**
     * Get new value of config if operation was success
     * @return new value of config
     */
    T newValue();

}
