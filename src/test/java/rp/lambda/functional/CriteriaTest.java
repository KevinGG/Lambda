package rp.lambda.functional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

/**
 * Tests for {@link Criteria}.
 * 
 * @author NK044575
 *
 */
public class CriteriaTest {
  // a criteria to evaluate String to see if it equals "true"
  private final Criteria<String> strCriteria = str -> str.equals("true");
  
  /**
   * Tests {@link Criteria} evaluation method should return true when the given input passes the evaluation.
   */
  @Test
  public void testCriteriaEvaluationTrue() {
    final boolean evaluation = strCriteria.evaluate("true");
        
    assertThat(evaluation, equalTo(true));
  }

  /**
   * Tests {@link Criteria} evaluation method should return false when the given input fails the evaluation.
   */
  @Test
  public void testCriteriaEvaluationFalse() {
    final boolean evaluation = strCriteria.evaluate("false");
    
    assertThat(evaluation, equalTo(false));
  }
}
