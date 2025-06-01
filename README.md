# IntegrationServer

## Overview
IntegrationServer is a comprehensive Java-based integration system built with Maven, featuring process engine capabilities, database integration, and messaging components.

## Project Structure
```
├── common/
│   ├── model/              # Data models and entities
│   └── valueObject/        # Value objects and DTOs
├── core/
│   └── application/        # Core application components
│       └── mariadb/        # Database configuration and data
├── process-engine/
│   ├── active-mq/          # ActiveMQ messaging configuration
│   ├── message-writer/     # Message processing components
│   └── server/             # Process engine server
└── pom.xml                 # Maven configuration
```

## Prerequisites
- Java 8 or higher
- Maven 3.6+
- MariaDB 10.x
- ActiveMQ 5.x

## Technologies Used
- **Java**: Core programming language
- **Maven**: Build and dependency management
- **Spring Boot**: Application framework
- **MariaDB**: Database
- **ActiveMQ**: Message broker
- **Eclipse**: IDE integration

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/SAWA622/integration-server.git
cd integration-server
```

### 2. Database Setup
1. Install MariaDB
2. Create database: `accessManagerDb`
3. Configure connection properties in `application.properties`

### 3. ActiveMQ Setup
1. Install ActiveMQ
2. Start ActiveMQ broker
3. Default URL: `tcp://localhost:61616`

### 4. Build the Project
```bash
mvn clean install
```

### 5. Run the Application
```bash
# Start the process engine server
cd process-engine/server
mvn spring-boot:run

# In another terminal, start message writer
cd process-engine/message-writer
mvn spring-boot:run
```

## Configuration
Update `application.properties` files in:
- `process-engine/server/src/main/resources/`
- `process-engine/message-writer/src/main/resources/`

Key configurations:
- Database connection URLs
- ActiveMQ broker settings
- Server ports
- Logging levels

## API Endpoints
The process engine provides REST APIs for:
- Executor management
- Configuration handling
- Script parameter processing
- Status monitoring

## Development

### Building Individual Modules
```bash
# Build common models
cd common/model && mvn clean install

# Build value objects
cd common/valueObject && mvn clean install

# Build process engine
cd process-engine && mvn clean install
```

### Running Tests
```bash
mvn test
```

### IDE Setup (Eclipse)
1. Import as Maven project
2. Ensure proper Java build path
3. Configure server runtime

## Deployment
1. Build the project: `mvn clean package`
2. Deploy WAR/JAR files to application server
3. Ensure database and ActiveMQ are running
4. Update production configuration

## Troubleshooting

### Common Issues
- **Database Connection**: Verify MariaDB is running and credentials are correct
- **ActiveMQ Connection**: Check if ActiveMQ broker is started
- **Port Conflicts**: Ensure configured ports are available
- **Memory Issues**: Increase JVM heap size if needed

### Logs Location
- Application logs: `logs/` directory
- ActiveMQ logs: `process-engine/active-mq/data/`

## Contributing
1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Submit a pull request


## Contact
- **Author**: Anand Sawant
- **Email**: [sawantue195104ece@gmail.com]

## Version History
- **v4.0**: Current version with enhanced process engine capabilities
- **v3.x**: Previous versions with basic integration features

## Additional Notes
- This project uses multi-module Maven structure
- Ensure all dependencies are resolved before building
- Check compatibility with your Java version
- Database schema scripts are included in the MariaDB data directory