/** @type {import('tailwindcss').Config} */
export default {
  content: ["./src/**/*.{html,js,jsx}"],
  theme: {
    extend: {
      backdropBlur: {
        'sm': '4px', // Add this line for custom blur
      }
    },
  },
  plugins: [],
}

