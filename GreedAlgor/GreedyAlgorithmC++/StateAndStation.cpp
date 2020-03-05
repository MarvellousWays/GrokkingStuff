#pragma once
#include <string>
#include <unordered_set>



class State
{
	
public:
	std::string name;
	State(std::string name) {
		this->name = name;
	}
	std::string getName() {
		return this->name;
	}
	bool operator==(const State &other) const {
		return name == other.name;
	}
	~State() {}
};

namespace std
{
	template<> struct hash<State>
	{
		std::size_t operator()(const State &k) const
		{
			using std::hash;
			using std::string;
			return hash<string>()(k.name);
		}
	};
}

class Station
{
private:
	std::unordered_set <State> statesCover;
public:
	std::string name;
	Station(std::string name) {
		this->name = name;
	}
	std::string getName() {
		return name;
	}
	void addState(State st) {
		statesCover.insert(st);
	}
	std::unordered_set<State> getStates() {
		return statesCover;
	}
	bool operator==(const Station &other) const {
		return name == other.name;
	}
	~Station() {}

};

namespace std
{
	template<> struct hash<Station>
	{
		std::size_t operator()(const Station &k) const
		{
			using std::hash;
			using std::string;
			return hash<string>()(k.name);
		}
	};
}



