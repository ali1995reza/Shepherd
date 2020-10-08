package shepherd.api.message;

/**
 *
 * Every message of the system will represent with Message Object
 * @param <T>
 */
public interface Message<T> {

    T data();
    MessageMetadata metadata();

}
