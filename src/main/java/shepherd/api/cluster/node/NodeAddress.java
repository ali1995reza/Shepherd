package shepherd.api.cluster.node;


/**
 * <p>
 *     This is an abstract class that will implemented by any implementation of API
 * </p>
 * @param <A> Address typ , example : SocketAddress for IP node implements
 */
public interface NodeAddress<A> {

    /**
     *
     * @return actual address wrapped by this class
     */
    A address();

}
