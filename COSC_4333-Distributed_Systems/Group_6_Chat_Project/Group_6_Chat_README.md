```
COSC 4333
Distributed Systems
Fall 2024
20241201

Chat_Program

Group 6
Andrew Hoffman 
Partner 1
Partner 2
```
# Multi-Threaded Chat Room Service

## Overview
In this project, students are required to implement a multi-threaded chat room service. The system will have one (multi-threaded) chat server, several chat rooms, and multiple chat clients. The socket interface is used to implement network communications.

## Getting Started
### Prerequisites
- A C compiler (e.g., GCC)
- Basic understanding of socket programming and multi-threading in C
- The provided `ChatroomClient.c`, `ChatroomServer.c`, and `Makefile` files (available in the "Chat_Program" folder)

### Structure
- `ChatroomClient.c`: Contains the structure of the chat client using socket programming.
- `ChatroomServer.c`: Contains the structure of the multi-threaded chat server using socket programming.

### Setup
1. **Download the Provided Files**: Ensure you have `ChatroomClient.c`, `ChatroomServer.c`, and `Makefile` downloaded from the "Chat_Program" folder.
2. **Compile the Programs**:
    
    - Run `make` in the terminal to compile or follow the below instructions for each client and server programs.
        
    - To compile the server:
        ```sh
        gcc -Wall -g3 -fsanitize=address -pthread ChatroomServer.c -o ChatroomServer
        ```
    - To compile the client:
        ```sh
        gcc -Wall -g3 -fsanitize=address -pthread ChatroomClient.c -o ChatroomClient
        ```

### Running the Programs
1. **Start the Server**:
   ```sh
   ./ChatroomServer <port>
   ```
   The server will initialize and start listening for client connections.

2. **Start the Clients**:
   ```sh
   ./ChatroomClient <port>
   ```
   Multiple clients can be started to join different chat rooms and communicate with each other.

### Features
- **Multi-threaded Server**: Handles multiple client connections concurrently.
- **Multiple Chat Rooms**: Allows clients to join different chat rooms.
- **Real-time Communication**: Clients can send and receive messages in real time.

### Implementation Details
- **Server**: 
  - Uses threads to handle multiple client connections simultaneously.
  - Manages chat rooms and client subscriptions to those rooms.
  - Relays messages from one client to all other clients in the same chat room.

- **Client**: 
  - Connects to the chat server using sockets.
  - Allows users to send messages to a chat room.
  - Receives and displays messages from other clients in the same chat room.

### Example Usage
```sh
# Start the server
./ChatroomServer 8000

# Start multiple clients in separate terminals
./ChatroomClient 8000
./ChatroomClient 8000
./ChatroomClient 8000
```


