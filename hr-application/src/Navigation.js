import React from 'react';
import { Link } from 'react-router-dom';

const Navigation = () => {
  return (
    <nav className="bg-gray-800">
      <div className="container mx-auto px-4">
        <div className="flex items-center justify-between h-16">
          {/* Logo */}
          <div className="flex-shrink-0">
            <Link to="/" className="text-white font-semibold text-xl">
              Hr app
            </Link>
          </div>

          {/* Navigation Links */}
          <div className="flex">
            <ul className="flex space-x-4">
              <li>
                <Link
                  to="/candidates"
                  className="text-gray-300 hover:bg-gray-700 hover:text-white px-3 py-2 rounded-md text-sm font-medium"
                >
                  Candidates
                </Link>
                <Link
                  to="/employees"
                  className="text-gray-300 hover:bg-gray-700 hover:text-white px-3 py-2 rounded-md text-sm font-medium"
                >
                  Employees
                </Link>
                <Link
                  to="/offers"
                  className="text-gray-300 hover:bg-gray-700 hover:text-white px-3 py-2 rounded-md text-sm font-medium"
                >
                  Offers
                </Link>
                <Link
                  to="/candidatures"
                  className="text-gray-300 hover:bg-gray-700 hover:text-white px-3 py-2 rounded-md text-sm font-medium"
                >
                  Candidatures
                </Link>
                <Link
                  to="/evaluations"
                  className="text-gray-300 hover:bg-gray-700 hover:text-white px-3 py-2 rounded-md text-sm font-medium"
                >
                  Evaluations
                </Link>
              </li>
              {/* Add other navigation links for other components */}
            </ul>
          </div>
        </div>
      </div>
    </nav>
  );
};

export default Navigation;
