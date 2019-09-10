@Log4j2
class CompletableFutureTests {
  private Runnable work = () -> {
    //@formatter:off
    try {
      log.info("Doing Work");
      Thread.sleep(1000);
      log.info("Done with Work");
    } catch (InterruptedException ignored) {}
    //@formatter:on
  };

  private Runnable moreWork = () -> {
    //@formatter:off
    try {
      log.info("Doing More Work");
      Thread.sleep(500);
      log.info("Done with More Work");
    } catch (InterruptedException ignored) {}
    //@formatter:on
  };

  private Runnable lotMoreWork = () -> {
    //@formatter:off
    try {
      log.info("Doing a Lot More Work");
      Thread.sleep(500);
      log.info("Done with a Lot More Work");
    } catch (InterruptedException ignored) {}
    //@formatter:on
  };

  private Supplier<String> firstValueGenerator = () -> {
    //@formatter:off
    try {
      log.info("Generating first value");
      Thread.sleep(ThreadLocalRandom.current().nextInt(500));
      log.info("Generated first value");
    } catch (InterruptedException ignored) {}
    return "1st value";
    //@formatter:on
  };

  private Supplier<String> secondValueGenerator = () -> {
    //@formatter:off
    try {
      log.info("Generating second value");
      Thread.sleep(ThreadLocalRandom.current().nextInt(500));
      log.info("Generated second value");
    } catch (InterruptedException ignored) {}
    return "2nd value";
    //@formatter:on
  };

  private Supplier<String> errorGenerator = () -> {
    //@formatter:off
    run(() -> Thread.sleep(ThreadLocalRandom.current().nextInt(500)));
    throw new IllegalStateException("Intentional error");
    //@formatter:on
  };

  // TODO: Add tests
}
