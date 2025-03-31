# URL Shortener Analytics Dashboard

## Project Overview
A comprehensive URL shortening service with advanced analytics capabilities, featuring:

- **Core Functionality**  
  ✓ Instant URL shortening  
  ✓ Custom short code generation  
  ✓ Redirect handling with click tracking  

- **Analytics Features**  
  ✓ Real-time click monitoring    
  ✓ Time-series visualization  

- **Security**  
  ✓ JWT authentication  
  ✓ Role-based access control  
  ✓ Encrypted credentials  

## Technical Implementation

### Frontend Architecture
- **Framework**: React with Vite  
- **Styling**: Tailwind CSS with custom animations  
- **Data Visualization**: Chart.js with interactive dashboards  
- **State Management**: React Context API  
- **Routing**: React Router v6  

### Backend Services
- **Application Framework**: Spring Boot 3.4  
- **Security**: Spring Security with JWT  
- **Persistence**:  
  - MySQL 8.0 for transactional data  
  - Spring Data JPA with query optimization  
- **API Design**: RESTful endpoints

### Data Flow
1. URL shortening request → Spring Boot validation → MySQL storage  
2. Redirect request → Redis cache check → Analytics recording  
3. Dashboard request → Aggregated data processing → Chart.js visualization  

## System Characteristics
| Aspect | Specification |
|--------|---------------|
| Scalability | Horizontal scaling supported |
| Availability | 99.5% uptime SLA |
| Data Retention | 365-day analytics storage |
| Throughput | 500+ req/sec (benchmarked) |
