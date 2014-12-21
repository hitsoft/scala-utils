package com.hitsoft.scala

import org.specs2._

/**
 * User: smeagol
 * Date: 21.12.14
 * Time: 23:47
 */
class OptionIfTest extends Specification {

  def is = s2"""
     Make option only if condition fired
         option first       $optionFirst
         condition first    $conditionFirst
  """

  def optionFirst =
    (OptionIf("some", condition = true) must_== Some("some")) and
      (OptionIf("some", condition = false) must_== None) and
      (OptionIf(null, condition = true) must_== None) and
      (OptionIf(null, condition = false) must_== None)


  def conditionFirst =
    (OptionIf(condition = true, "some") must_== Some("some")) and
      (OptionIf(condition = false, "some") must_== None) and
      (OptionIf(condition = true, null) must_== None) and
      (OptionIf(condition = false, null) must_== None)

}
