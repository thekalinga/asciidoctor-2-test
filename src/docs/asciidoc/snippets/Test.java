@Log4j2
class RootIncludedTestClass {
  private Runnable work = () -> {
    //@formatter:off
    try {
      log.info("Doing Work");
      Thread.sleep(1000);
      log.info("Done with Work");
    } catch (InterruptedException ignored) {}
    //@formatter:on
  };

  // TODO: Add tests
}
