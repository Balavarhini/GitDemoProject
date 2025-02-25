<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            overflow: hidden; /* Hide overflow for animation effects */
        }

        .success-message {
            text-align: center;
            margin-top: 20%;
        }

        .success-message h1 {
            font-size: 3rem;
            color: #4CAF50;
        }

        .success-message p {
            font-size: 1.5rem;
            color: #333;
        }

        .coins-container {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            pointer-events: none; /* Prevent interaction with coins */
            overflow: hidden;
        }

        .coin {
            position: absolute;
            width: 20px;
            height: 20px;
            background-color: gold;
            border-radius: 50%;
            animation: fall 3s linear infinite, rotate 1.5s linear infinite;
            box-shadow: 0 0 10px rgba(255, 223, 0, 0.8);
        }

        @keyframes fall {
            0% {
                transform: translateY(-100%) translateX(0);
            }
            100% {
                transform: translateY(100vh) translateX(20vw);
                opacity: 0;
            }
        }

        @keyframes rotate {
            0% {
                transform: rotate(0deg);
            }
            100% {
                transform: rotate(360deg);
            }
        }
    </style>
</head>
<body>
    <div class="coins-container">
        <!-- Dynamically generating coins -->
        <div class="coin" style="left: 10%; animation-delay: 0s;"></div>
        <div class="coin" style="left: 30%; animation-delay: 0.3s;"></div>
        <div class="coin" style="left: 50%; animation-delay: 0.6s;"></div>
        <div class="coin" style="left: 70%; animation-delay: 0.9s;"></div>
        <div class="coin" style="left: 90%; animation-delay: 1.2s;"></div>
    </div>

    <div class="success-message">
        <h1>Success!</h1>
        <p>Your operation was completed successfully.</p>
    </div>
</body>
</html>