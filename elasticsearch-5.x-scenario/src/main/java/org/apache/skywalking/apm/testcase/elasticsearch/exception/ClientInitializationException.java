package org.apache.skywalking.apm.testcase.elasticsearch.exception;

/**
 * @author oatiz.
 */
public class ClientInitializationException extends RuntimeException {

    public ClientInitializationException(String message) {
        super(message);
    }
    
}
