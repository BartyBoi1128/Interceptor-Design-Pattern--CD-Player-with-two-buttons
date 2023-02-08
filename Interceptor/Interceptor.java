interface Interceptor {
    void beforeExecute(Request request);
    void afterExecute(Request request);
}
