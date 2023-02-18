
//----------------------------------------------------------------------------
// QUEST SUMMER 2022 HS RESEARCH PROJECT
//----------------------------------------------------------------------------
// Student Name : Trisha NANDAKUMAR
// Complier Info : MacOs, xcode2 using clang compiler
// Purpose : This program finds the correlation coeffecients of confirmed cases and deaths for 2 different time periods (before and after covid-19 vaccination) to determine if covid-19 vaccination 
//----------------------------------------------------------------------------
// int xi=the sum of all values in array X
//int yi=the sum of all values in array Y
//int length= the length of the array
//double xavg=the average of all values in array x
//double yavg=the average of all values in array y
//double xy=sum of corresponding x and y values multiplied (ex. 34*15 + 28+14...)
//double x2=the sum of all values in x array squared (34^2 + 28^2...)
//double y2=the sum of all values in y array squared
//double bottomEquation1 = the sigma of (x values - x average)^2
//double bottomEquation2 = the sigma of (y values - y average)^2
//double topEquation = sigma of the product of (x values - x average) and (y values - y average)
//double equation= final equation where output is found
//int times, xx, yy= local variables created to store values
//int X[], Y[] = 1d arrays that store values used by this program to calculate correlation coeffecient
//double cc=to store what the function returned and variable used to print output
//int e= acts as the key word that is used in condition
//double afterResult=stores reult of correlation coefficent for after vaccination
//double afterVaccinationC1=contains after vaccination confirmed cases data
//double afterVaccinationC2=contains after vaccination confirmed deaths data
//int arraySize = length of array
  //      double beforeResult=stores reult of correlation coefficent for before vaccination
    //    double beforeVaccinationC1=contains before vaccination confirmed cases data
// double beforeVaccinationC2=contains after vaccination confirmed deaths data
 
#include <iostream>
#include <fstream>
#include <cmath>
using namespace std;
 
 
double myCorrelationCoefficientCalculator(double x[], double y[], int si)
{
    int xi=0;
    int yi=0;
    int length=si;
    double xavg;
    double yavg;
    double xy=0.0;
    double x2 = 0;
    double y2 = 0;
    double bottomEquation1;
    double bottomEquation2;
    double topEquation;
    
    for (int i=0; i<length;i++){
        xi=xi+ x[i];
    }
    
    
    
    for (int i=0;i<length;i++){
        yi=yi+y[i];
    }
    
    for (int i=0;i<length;i++){
        int times=x[i]*y[i];
        xy= xy+times;
    }
    
    for (int i=0; i<length;i++){
        int xx=x[i]*x[i];
        x2=xx+x2;
    }
    
    for (int i=0; i<length;i++){
        int yy=y[i]*y[i];
        y2=yy+y2;
    }
     
     xavg=double(xi)/length;
     yavg=double(yi)/length;
     
     
      bottomEquation1 =x2-((xi*xi)/length);
      bottomEquation2=y2-((yi*yi)/length);
     topEquation=xy-((xi*yi)/length);
     
     double equation=topEquation/(sqrt(bottomEquation1*bottomEquation2));
     
     return equation;
     
 }
  
  
  
  
 int main() {
     
     int e=0;
     double afterResult;
     double afterVaccinationC1[183];
     double afterVaccinationC2[183];
     int arraySize = 183   ;
             double beforeResult;
             double beforeVaccinationC1[183];
            double beforeVaccinationC2[183];
   
     std::cout << "Investigation of Effectiveness of the Covid-19 Vaccination\n";
     std::cout<<"\n";
     std::cout<<"\n";
     std::cout<<"The purpose of this program is to investigate the correlation between confirmed cases vs confirmed deaths before and the after the Covid-19 Vaccination campaign launch. The data, which was put in .txt files and read into arrays, used is from the website Our World In Data. The data from before (October 1st, 2020-April 1st, 2021) and after(October 1st, 2021-April 1st, 2022) the Covid-19 Vaccination Campaign was put in a correlation coeffecient finding function to answer the research question: Does Covid-19 Vaccination have an impact on the number of deaths?  \n";
     std::cout<<"\n";
     std::cout << "To start, please enter the country name\n";
     std::cout<<"To exit, please type exit\n";
     
     std::string entry;
     std::cin>>entry;
    
     while (e==0)
     {
         if (entry=="USA"){
             e=1;
             std::cout<<"\n";
         }
         else if (entry=="exit"){
             std::cout<<"Thank you for using this program!\n";
             return 0;
         }
         else{
             std::cout<<"Warning: Invalid Entry, Please Try Again";
             std::cin>>entry;
             e=0;
         }
     }
     
   
         
     
     
     
     
     
     
     
     
         ifstream inputData;
         inputData.open("/Users/trishanandakumar/Desktop/cpp/NANDAKUMAR_Week4.cpp/BeforeVaccination.txt");
         for (int i=0; i<arraySize; i++)
         {
             inputData>>beforeVaccinationC1[i];
             inputData>>beforeVaccinationC2[i];
         }
         inputData.close();
     
         beforeResult=myCorrelationCoefficientCalculator(beforeVaccinationC1,beforeVaccinationC2,arraySize);
  
     
         
     
     
     
     
         
         inputData.open("/Users/trishanandakumar/Desktop/cpp/NANDAKUMAR_Week4.cpp/AfterVaccination.txt");
         for (int i=0; i<arraySize; i++)
         {
             inputData>>afterVaccinationC1[i];
             inputData>>afterVaccinationC2[i];
         }
         inputData.close();
         afterResult= myCorrelationCoefficientCalculator(afterVaccinationC1, afterVaccinationC2, arraySize);
     
     
     
     
     
     
     
     
     
     
     if (beforeResult==0)
         std::cout<<"There is no correlation between confirmed cases and confirmed deaths before the covid-19 campaign";
     else if (beforeResult>0 && beforeResult<.2)
         std::cout<<"There is a very weak correlation between confirmed cases and confirmed deaths before the covid-19 campaign";
     else if (beforeResult>=.2 && beforeResult<.4)
         std::cout<<"There is a weak correlation between confirmed cases and confirmed deaths before the covid-19 campaign";
     else if (beforeResult>=0.4 && beforeResult<.6)
         std::cout<<"There is a moderate correlation between confirmed cases and confirmed deaths before the covid-19 campaign";
     else if (beforeResult>=0.6 && beforeResult<.8)
         std::cout<<"There is a strong correlation between confirmed cases and confirmed deaths before the covid-19 campaign";
     else if (beforeResult>=0.8 && beforeResult<1   )
         std::cout<<"There is a very strong correlation between confirmed cases and confirmed deaths before the covid-19 campaign";
     else
         std::cout<<"There is a perfect correlation between confirmed cases and confirmed deaths before the covid-19 campaign";
     
     std::cout<<"\n";   
     
     if (afterResult==0)
         std::cout<<"There is no correlation between confirmed cases and confirmed deaths after the covid-19 campaign";
     else if (afterResult>0 && afterResult<.2)
         std::cout<<"There is a very weak correlation between confirmed cases and confirmed deaths after the covid-19 campaign";
     else if (afterResult>=.2 && afterResult<.4)
         std::cout<<"There is a weak correlation between confirmed cases and confirmed deaths after the covid-19 campaign";
     else if (afterResult>=0.4 && afterResult<.6)
         std::cout<<"There is a moderate correlation between confirmed cases and confirmed deaths after the covid-19 campaign, so there has been an impact on the number of deaths due to the vaccine. ";
     else if (afterResult>=0.6 && afterResult<.8)
         std::cout<<"There is a strong correlation between confirmed cases and confirmed deaths after the covid-19 campaign, so there has been an impact on the number of deaths due to the vaccine.";
     else if (afterResult>=0.8 && afterResult<1   )
         std::cout<<"There is a very strong correlation between confirmed cases and confirmed deaths after the covid-19 campaign, so there has been an impact on the number of deaths due to the vaccine.";
     else
         std::cout<<"There is a perfect correlation between confirmed cases and confirmed deaths after the covid-19 campaign, so there has been an impact on the number of deaths due to the vaccine.";
     
     
     std::cout<<"\n";
     std::cout<<"\n";
     std::cout<<"Thank you for using this program!\n";
     
     return 0;
         }
 
