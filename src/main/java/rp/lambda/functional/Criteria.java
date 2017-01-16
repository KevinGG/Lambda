package rp.lambda.functional;

/**
 * Criteria functional interface. 
 * <br/>
 * <b>Details</b>: Any instance of {@link Criteria} would describe some kind of criteria composed by statements that could be evaluated to a boolean result.
 * <br/>
 * <b>Interface</b>: This interface provides single unimplemented method
 * {@link Criteria#evaluate(Object)} to evaluate the passed-in parameter based on the criteria evaluation statements.
 * <br/>
 * <b>Purpose</b>: decoupling the evaluation logic from evaluation invocations
 * <br/>
 * <b>Example</b>:
 * Assume you want to filter a List<T> <i>list</i> based on your self-defined Criteria<T> instance <i>criteria</i>, you could do this:
 * <pre>
 * {@code
 * list.stream().filter(entry -> criteria.evaluate(entry)).collect(Collectors.list());
 * }
 * </pre>
 * 
 * @author KevinGG
 *
 * @param <T>
 */
public interface Criteria<T> {
  
  /**
   * Evaluates if the given <i>t</i> matches the {@link Criteria} statements defined in this method.
   * @param t The entry to be evaluated by this {@link Criteria}.
   * @return true if the given <i>t</i> matches the {@link Criteria} statements defined in this method; otherwise, false.
   */
  public boolean evaluate(final T t);
}
