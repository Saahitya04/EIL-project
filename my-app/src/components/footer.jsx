// src/components/Footer.jsx
import React from 'react';

const Footer = () => {
  return (
    <footer className="bg-footer text-black p-4 text-center mt-auto shadow-inner min-w-[100vw]">
      <p>&copy; {new Date().getFullYear()} My Awesome App. All rights reserved.</p>
      <div className="flex justify-center space-x-4 mt-2">
        <a href="#" className="text-footerLink">Privacy Policy</a>
        <a href="#" className="text-footerLink">Terms of Service</a>
      </div>
    </footer>
  );
};

export default Footer;
