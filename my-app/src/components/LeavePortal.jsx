import { useState } from "react";
import { Building, LogOut } from "lucide-react";
import { Button } from "@/components/ui/button";
import LeaveForm from "../components/LeaveForm";
import LeaveSummary from "../components/LeaveSummary";
import LeaveHistory from "../components/LeaveHistory";
import { mockEmployee } from "../data/mockData";

const LeavePortal = () => {
  const [refreshKey, setRefreshKey] = useState(0);

  const handleFormSubmitSuccess = () => {
    // Refresh components by changing key
    setRefreshKey(prev => prev + 1);
  };

  return (
    <div className="min-h-screen bg-eil-grey min-w-[100vw]">
      {/* Header */}
      <header className="bg-white shadow-sm border-b-2 border-eil-blue">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
          <div className="flex justify-between items-center h-16">
            <div className="flex items-center space-x-4">
              <div className="flex items-center space-x-3">
                <div className="w-10 h-10 bg-eil-blue rounded-lg flex items-center justify-center">
                  <Building className="text-white text-lg" />
                </div>
                <div>
                  <h1 className="text-xl font-bold text-gray-900">Engineers India Limited</h1>
                  <p className="text-sm text-eil-grey-dark">Leave Management Portal</p>
                </div>
              </div>
            </div>
            <div className="flex items-center space-x-4">
              <span className="text-sm text-eil-grey-dark">
                Welcome, {mockEmployee.name}
              </span>
              <Button 
                variant="ghost" 
                size="sm" 
                className="text-eil-blue hover:text-eil-blue-light hover:bg-blue-50"
              >
                <LogOut className="h-4 w-4" />
              </Button>
            </div>
          </div>
        </div>
      </header>

      {/* Main Content */}
      <main className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
        <div className="grid grid-cols-1 lg:grid-cols-3 gap-8">
          
          {/* Left Column: Leave Form and History */}
          <div className="lg:col-span-2">
            <LeaveForm 
              key={`form-${refreshKey}`}
              onSubmitSuccess={handleFormSubmitSuccess} 
            />
            <LeaveHistory key={`history-${refreshKey}`} />
          </div>

          {/* Right Column: Leave Summary */}
          <div className="lg:col-span-1">
            <LeaveSummary key={`summary-${refreshKey}`} />
          </div>
        </div>
      </main>

      {/* Footer */}
      <footer className="bg-white border-t border-gray-200 mt-12">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-6">
          <div className="flex flex-col md:flex-row justify-between items-center">
            <div className="text-sm text-eil-grey-dark">
              © 2024 Engineers India Limited. All rights reserved.
            </div>
            <div className="flex space-x-6 mt-4 md:mt-0">
              <a href="#" className="text-sm text-eil-grey-dark hover:text-eil-blue transition-colors">
                Help
              </a>
              <a href="#" className="text-sm text-eil-grey-dark hover:text-eil-blue transition-colors">
                Contact IT
              </a>
              <a href="#" className="text-sm text-eil-grey-dark hover:text-eil-blue transition-colors">
                Privacy Policy
              </a>
            </div>
          </div>
        </div>
      </footer>

      {/* Load jsPDF from CDN for PDF export functionality */}
      <script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/2.5.1/jspdf.umd.min.js"></script>
    </div>
  );
};

export default LeavePortal;
