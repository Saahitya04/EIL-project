/** @type {import('tailwindcss').Config} */
export default {
  content: ["./index.html","./src/**/*.{js,jsx}"],
  theme: {
    extend: {
      backdropBlur: {
        'sm': '4px', // Add this line for custom blur
      },
      colors: {
        primary: '#617e9b',
        secondary: '#0a517c',
        footer: '#c5e4f9',
        footerfollowElem: '#00589b',
        footerLink: '#065598'
      },
      fontFamily: {
        raleway: ['Raleway', 'sans-serif'],
      },
    },
  },
  plugins: [],
}

