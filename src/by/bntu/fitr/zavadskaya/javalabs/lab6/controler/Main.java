package by.bntu.fitr.zavadskaya.javalabs.lab6.controler;

import by.bntu.fitr.zavadskaya.javalabs.lab6.logic.Logic;
import by.bntu.fitr.zavadskaya.javalabs.lab6.view.Inputer;
import by.bntu.fitr.zavadskaya.javalabs.lab6.view.Outputer;

public class Main {

	public static void main(String[] args) {
		Outputer.output("Ñhecking numbers for equality." + Logic.equalityÑheck(Inputer.input("Input first number: "),
				Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output("Checking at least one pair of numbers for equality."
				+ Logic.atLeastOnePairOfEqualNumbersCheck(Inputer.input("Input first number: "),
						Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output("Sign check." + Logic.signÑheck(Inputer.input("Input first number: "),
				Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output("Checking at least one positive number."
				+ Logic.atLeastOnePositiveNumberCheck(Inputer.input("Input first number: "),
						Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output(
				"Checking one positive number." + Logic.onePositiveNumberCheck(Inputer.input("Input first number: "),
						Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output(
				"Ñhecking two positive number." + Logic.twoPositiveNumberCheck(Inputer.input("Input first number: "),
						Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output("Ñhecking parity." + Logic.evenNumbersCheck(Inputer.input("Input first number: "),
				Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output(
				"Ñhecking at least one parity." + Logic.atLeastOneEvenNumberCheck(Inputer.input("Input first number: "),
						Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output("Ñhecking one parity." + Logic.oneEvenNumberCheck(Inputer.input("Input first number: "),
				Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output("Ñhecking equal parity." + Logic.equalEvenNumberCheck(Inputer.input("Input first number: "),
				Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output("Ñhecking two parity numbers." + Logic.twoEvenNumberCheck(Inputer.input("Input first number: "),
				Inputer.input("Input second number: "), Inputer.input("Input third number: ")));

		Outputer.output("Checking sequence." + Logic.sequenceCheck(Inputer.input("Input number: ")));

		Outputer.output("Checking palindrome." + Logic.palindromeCheck(Inputer.input("Input number: ")));

		Outputer.output("Checking quarter coordinate."
				+ Logic.firstQuarterCheck(Inputer.input("Input x: "), Inputer.input("Input y: ")));

		Outputer.output("Checking triangle." + Logic.isTriangleCheck(Inputer.input("Input first side: "),
				Inputer.input("Input second side: "), Inputer.input("Input third side: ")));

		Outputer.output(
				"Checking equilateral triangle." + Logic.isEquilateralTriangleCheck(Inputer.input("Input first side: "),
						Inputer.input("Input second side: "), Inputer.input("Input third side: ")));

		Outputer.output(
				"Checking isosceles triangle." + Logic.isIsoscelesTriangleCheck(Inputer.input("Input first side: "),
						Inputer.input("Input second side: "), Inputer.input("Input third side: ")));

		Outputer.output("Checking right triangle." + Logic.isRightTriangleCheck(Inputer.input("Input first side: "),
				Inputer.input("Input second side: "), Inputer.input("Input third side: ")));

		Outputer.output("Checking right and isosceles triangle."
				+ Logic.isRightAndIsoscelesCheck(Inputer.input("Input first side: "),
						Inputer.input("Input second side: "), Inputer.input("Input third side: ")));

		Outputer.output("Checking point."
				+ Logic.pointCheck(Inputer.input("Input x: "), Inputer.input("Input y: "), Inputer.input("Input x1: "),
						Inputer.input("Input y1: "), Inputer.input("Input x2: "), Inputer.input("Input y2: ")));
	}

}
