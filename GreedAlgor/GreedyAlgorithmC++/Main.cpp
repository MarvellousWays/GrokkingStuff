#include <iostream>
#include <vector>
#include <set>
#include "StateAndStation.cpp"
#include "Main.h"

std::unordered_set<Station> allStations;
std::unordered_set<Station> finalStations;
std::vector<State> states;
std::unordered_set<State> statesNeeded;

void prepareState(std::string name) {
	State temp = *new State(name);
	states.push_back(temp);
	statesNeeded.insert(temp);
}

int main() {
	prepareState("mt");
	prepareState("wa");
	prepareState("or");
	prepareState("id");
	prepareState("nv");
	prepareState("ut");
	prepareState("ca");
	prepareState("az");

	Station temp = *new Station("kone");
	temp.addState(states.at(3));
	temp.addState(states.at(4));
	temp.addState(states.at(5));
	allStations.insert(temp);

	Station temp1 = *new Station("ktwo");
	temp1.addState(states.at(3));
	temp1.addState(states.at(1));
	temp1.addState(states.at(0));
	allStations.insert(temp1);

	Station temp2 = *new Station("kthree");
	temp2.addState(states.at(2));
	temp2.addState(states.at(4));
	temp2.addState(states.at(6));
	allStations.insert(temp2);

	Station temp3 = *new Station("kone");
	temp3.addState(states.at(4));
	temp3.addState(states.at(5));
	allStations.insert(temp3);

	Station temp4 = *new Station("kone");
	temp4.addState(states.at(6));
	temp4.addState(states.at(7));
	allStations.insert(temp4);

	while (statesNeeded.size() > 0) {
		Station bestStation("error");
		std::unordered_set<State> statesCovered;
		for (auto i = allStations.begin(); i != allStations.end(); i++)
		{
			std::unordered_set<State> covered;
			covered = intersect(statesNeeded, i*);
			if (covered.size() > statesCovered.size()) {
				bestStation = i*;
				statesCovered = covered;
			}
		}
		statesNeeded.erase(statesCovered);
		finalStations.insert(bestStation);
	}

	system("pause");
	return 0;
}



std::unordered_set<State> intersect (std::unordered_set<State> firstSet, std::unordered_set<State> secondSet) {
	std::unordered_set<State> out;
	for (auto i = firstSet.begin(); i != firstSet.end(); i++) {
		if (secondSet.find(*i) != secondSet.end()) {
			out.insert(*i);
		}
	}
	return out;
}