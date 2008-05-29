#include "Timer.h"
#include "Options.h"
#include <sstream>
#include <iostream>

// Constructor starts the timer
Timer::Timer(std::string funcString) : m_funcStr(funcString)
{
	m_start = std::clock();
}

// Destructor stops it and prints
Timer::~Timer()
{
	if (opt::verbose > 0)
		std::cout << toString() << std::endl;
}

std::string Timer::toString() const
{
	clock_t ticks = std::clock() - m_start;
	double time = (double)ticks / (double)CLOCKS_PER_SEC;
	
	std::stringstream os;
	os << m_funcStr << ": " << time << "s";
	std::string out = os.str(); 
	return out;
}
