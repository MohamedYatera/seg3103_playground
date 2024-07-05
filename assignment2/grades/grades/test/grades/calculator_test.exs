defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

  describe "percentage_grade/1" do
    test "sample with zero grades" do
      assert 41 ==
               Calculator.percentage_grade(%{
                 homework: [0], # Testing with zero homework grades (line 4)
                 labs: [0], # Testing with zero lab grades (line 11)
                 midterm: 0.70,
                 final: 0.9
               })
    end

    test "sample with valid grades" do
      assert 85 ==
               Calculator.percentage_grade(%{
                 homework: [0.8], # Testing with a single homework grade (line 6)
                 labs: [1, 1, 1], # Testing with multiple lab grades (line 13)
                 midterm: 0.70,
                 final: 0.9
               })
    end


    test "letter_grade top lines" do
      assert "EIN" ==
               Calculator.letter_grade(%{
                 homework: [0], # (line 23)(line 43)
                 labs: [0], # (line 30)
                 midterm: 0.70,
                 final: 0.9
               })
    end

     test "letter_grade lower lines" do
      assert "B+" ==
               Calculator.letter_grade(%{
                 homework: [0.5], # (line 25)(line 45)
                 labs: [1,1,1], # (line 30)
                 midterm: 0.70,
                 final: 0.9
               })
    end


      test "numeric_grade top lines" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [0], # (line 66)(line 86)
                 labs: [0], # (line 73)
                 midterm: 0.70,
                 final: 0.9
               })
    end


     test "numeric_grade bottom lines" do
      assert 7 ==
               Calculator.numeric_grade(%{
                 homework: [0.5], # (line 68)(line 88)
                 labs: [1,1,1], # (line 75)
                 midterm: 0.70,
                 final: 0.9
               })
    end

  end
end
