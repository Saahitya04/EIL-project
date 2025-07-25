import React, { useState } from 'react';
import Header from './header.jsx';
import Footer from './footer.jsx';
import Dashboard from './dashboard.jsx';
// import App from '../App.jsx';

const Profile = () => {
    const [currentPage, setCurrentPage] = useState('dashboard');

    function navigatePage(page) {
        setCurrentPage(page);
    }

    const handleLogout = () => {
        alert('User logged out!'); // In a real app, you'd clear auth tokens, redirect, etc.
        // For demonstration, let's just alert and maybe redirect to home or login page
        // setCurrentPage('home'); // Or a dedicated login page
    };

    const renderPage = () => {
        switch (currentPage) {
            case 'dashboard':
                return <Dashboard />;
            case 'attendance':
                return <Attendance />;
            case 'leave':
                return <Leave />;
        }
    }
    return (
        <div>
            <div>
                <Header currentPage={currentPage} onNavigate={navigatePage} onLogout={handleLogout} loginStatus="EMP" />
            </div>
            <div className = "mb-4">
                {renderPage()}
            </div>
            <div className=''>
                <Footer />
            </div>

        </div>
    )
}

export default Profile;
