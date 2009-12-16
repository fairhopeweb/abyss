#ifndef CONTIGPATH_H
#define CONTIGPATH_H 1

#include "Dictionary.h"
#include "PairUtils.h" // for LinearNumKey
#include <algorithm>
#include <cassert>
#include <functional>
#include <istream>
#include <iterator>
#include <ostream>
#include <sstream>
#include <vector>

struct MergeNode
{
	LinearNumKey id;
	bool isRC;
	
	void flip() { isRC = (isRC) ? 0 : 1; }

	bool operator ==(const MergeNode& o) const
	{
		return id == o.id && isRC == o.isRC;
	}

	bool operator <(const MergeNode& o) const
	{
		return id != o.id ? id < o.id : isRC < o.isRC;
	}

	friend std::ostream& operator<<(std::ostream& out,
			const MergeNode& o)
	{
		return out << g_contigIDs.key(o.id) << ',' << o.isRC;
	}

	friend std::istream& operator>>(std::istream& in, MergeNode& o)
	{
		char c;
		unsigned cid;
		in >> cid >> c >> o.isRC;
		if (in.good()) {
			assert(c == ',');
			std::stringstream s;
			s << cid;
			o.id = g_contigIDs.serial(s.str());
		}
		return in;
	}
};

class ContigPath : public std::vector<MergeNode>
{
	typedef std::vector<MergeNode> Vector;

	public:
		ContigPath() { }

		template <class InputIterator>
		ContigPath(InputIterator first, InputIterator last)
			: Vector(first, last) { }

		/** Reverse the path and flip every node. */
		void reverseComplement()
		{
			std::reverse(begin(), end());
			std::for_each(begin(), end(),
					std::mem_fun_ref(&MergeNode::flip));
		}
};

std::ostream& operator<<(std::ostream& out, const ContigPath& o)
{
	ContigPath::const_iterator last = o.end() - 1;
	copy(o.begin(), last, std::ostream_iterator<MergeNode>(out, " "));
	return out << *last;
}

std::istream& operator>>(std::istream& in, ContigPath& o)
{
	copy(std::istream_iterator<MergeNode>(in),
			std::istream_iterator<MergeNode>(),
			back_inserter(o));
	return in;
}

#endif
