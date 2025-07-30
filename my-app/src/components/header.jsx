// src/components/Header.jsx
import React, { useState, useEffect, useRef } from 'react';

const Header = ({ currentPage, onNavigate, onLogout, loginStatus }) => {
  const [isDropdownOpen, setIsDropdownOpen] = useState(false);
  // useRef to create a reference to the profile button and dropdown for click detection
  const dropdownRef = useRef(null);
  const profileButtonRef = useRef(null);

  // Effect to handle clicks outside the dropdown
  useEffect(() => {
    const handleClickOutside = (event) => {
      // If the click is outside both the dropdown and the profile button, close the dropdown
      if (
        dropdownRef.current &&
        !dropdownRef.current.contains(event.target) &&
        profileButtonRef.current &&
        !profileButtonRef.current.contains(event.target)
      ) {
        setIsDropdownOpen(false);
      }
    };

    // Add event listener when component mounts
    document.addEventListener('mousedown', handleClickOutside);

    // Clean up event listener when component unmounts
    return () => {
      document.removeEventListener('mousedown', handleClickOutside);
    };
  }, []); // Empty dependency array means this effect runs once on mount and cleans up on unmount

  const toggleDropdown = (event) => {
    // Stop propagation to prevent the document-level click listener from immediately closing it
    event.stopPropagation();
    setIsDropdownOpen(prev => !prev);
  };

  const handleLogoutClick = () => {
    setIsDropdownOpen(false); // Close dropdown immediately
    onLogout(); // Call the logout function passed from App.jsx
  };

  const capitalizeName = (name) => {
    return name.toUpperCase();
  };

  if (loginStatus == "EMP") {
    return (
      <header className="mb-4">
        <div className="bg-primary text-white p-4 shadow-md flex justify-between items-center sticky top-0">
          <img src="./src/assets/eil_logo_60_transformation.png" alt="EIL"></img>
          <nav className="flex items-center space-x-4">
            <ul className="flex space-x-4 text-white">
              <li>
                <button
                  onClick={() => onNavigate('dashboard')}
                  className={`px-3 py-2 text-lg rounded-md transition-colors duration-200 bg-transparent hover:bg-gray-200 hover:text-gray-900 font-normal`}
                >
                  EMPLOYEE DASHBOARD
                </button>
              </li>
            </ul>

            {/* Profile Icon and Dropdown */}
            <div className="relative ml-4">
              <button
                ref={profileButtonRef} // Attach ref to the button
                onClick={toggleDropdown}
                className="bg-transparent border-none"
              >
                <img src="./src/assets/profile.svg" alt="Profile" className="w-[7] h-[7] border-2 border-white rounded-full p-1" ></img>
              </button>

              {/* Dropdown Menu */}
              {isDropdownOpen && (
                <div
                  ref={dropdownRef} // Attach ref to the dropdown div
                  className="absolute right-0 mt-2 w-48 bg-white rounded-md shadow-lg py-1 z-50 ring-1 ring-black ring-opacity-5 focus:outline-none"
                  role="menu"
                  aria-orientation="vertical"
                  aria-labelledby="profile-menu-button"
                >
                  <button
                    onClick={handleLogoutClick}
                    className="block w-full text-left px-4 py-2 text-sm text-red-600 hover:bg-red-50 hover:text-red-700 transition-colors duration-200 rounded-b-md bg-transparent border-none"
                    role="menuitem"
                  >
                    Logout
                  </button>
                </div>
              )}
            </div>
          </nav>
        </div>
        <div className="bg-secondary text-white h-[180px] flex items-center justify-center">
          <span className='text-white text-[30px] font-semibold'>{capitalizeName(currentPage)}</span>
        </div>
      </header>
    );
  } else {
    return(
      <div> Hi </div>
    );
  }
};

export default Header;
