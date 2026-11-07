import asyncio 

async def fetch_data(delay,id):
    print("fetching data...", id)
    await asyncio.sleep(delay)
    print("Data fetched.", id)
    return {"data": "Some rnadom data", "id":id}

async def main():
    print("starting the main coroutine..")
    task1 = fetch_data(5,1)
    task2 = fetch_data(5, 2)
    result1 = await task1 
    print(f"received result: {result1}")
    result2 = await task2
    print(f"received result: {result2}")
    print("End of main coroutine.")


#coroutine function
#async def main():
#    print("Start the fucking main coroutine.")
#    await
#for running the main coroutine

asyncio.run(main())

