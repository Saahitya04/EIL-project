import React, { useState } from 'react';

const LoginPage = () => {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [errorMessage, setErrorMessage] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();


        // try {
        //     const response = await fetch('http://localhost:8080/api/login', {
        //         method: 'POST',
        //         headers: {
        //             'Content-Type': 'application/json',
        //         },
        //         body: JSON.stringify({
        //             username: username,
        //             password: password
        //         }),
        //     });

        //     if (!response.ok) {
        //         throw new Error('Login failed');
        //     }

        //     const data = await response.json(); // if your backend sends any response
        //     console.log('Login successful:', data);
        //     setErrorMessage('');
        //     // Redirect user, store token, etc.
        // } catch (error) {
        //     console.error('Error during login:', error);
        //     setErrorMessage('Invalid username or password');
        // }


        // if (username !== 'admin' || password !== '1234') {
        //     setErrorMessage('Invalid username or password');
        // } else {
        //     setErrorMessage('');
        //     // Continue login logic...
        // }
    };

    return (
        <div id="login-body" style={{ backgroundImage: 'url(./src/assets/EILPHOTO.jpg)' }} className="bg-cover bg-center h-screen w-full no-repeat bg-[top_center] flex justify-center items-center">
            <div className="flex items-center justify-center min-h-screen w-full backdrop-blur-sm">
                <div className="bg-white/80 p-8 rounded-lg shadow-xl w-full h-50 max-w-sm text-center shadow-[8px_8px_20px_rgba(0,0,0,1)]">
                    <img
                        src="./src/assets/EILPHOTO2.png"
                        alt="Description of image"
                        className="w-24 h-24 mx-auto mb-6 rounded-full shadow-lg"
                    />
                    <h2 className="text-3xl font-bold mb-6 text-gray-800">Login</h2>

                    <form onSubmit={handleSubmit}>
                        <div className="mb-4 text-left">
                            <label
                                htmlFor="username"
                                className="block text-gray-700 text-sm font-semibold mb-2"
                            >
                                Username
                            </label>
                            <input
                                type="text"
                                id="username"
                                name="username"
                                required
                                value={username}
                                onChange={(e) => setUsername(e.target.value)}
                                className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent"
                            />
                        </div>
                        <div className="mb-6 text-left">
                            <label
                                htmlFor="password"
                                className="block text-gray-700 text-sm font-semibold mb-2"
                            >
                                Password
                            </label>
                            <input
                                type="password"
                                id="password"
                                name="password"
                                required
                                value={password}
                                onChange={(e) => setPassword(e.target.value)}
                                className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 mb-3 leading-tight focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent bg-white"
                            />
                        </div>
                        <button
                            type="submit"
                            className="bg-blue-600 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline w-full transition duration-150 ease-in-out"
                        >
                            Login
                        </button>
                        {errorMessage && (
                            <p className="text-red-500 text-sm mt-4">{errorMessage}</p>
                        )}

                        <div className="mt-4 text-sm">
                            <a
                                href="forgot-password.html"
                                className="text-blue-600 hover:text-blue-800 hover:underline"
                            >
                                Forgot Password?
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    );
};

export default LoginPage;
