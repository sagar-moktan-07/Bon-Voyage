from fastapi import FastAPI

api = FastAPI()

all_todos = [
    {'todo_id': 1, 'todo_name': 'Sports', 'todo_derscpion': 'play a physical game'},
    {'todo_id': 0, 'todo_name': 'readss', 'todo_derscpion': 'read some bookes like atleast 10 pages..'},
    {'todo_id': 2, 'todo_name': 'walkss', 'todo_derscpion': 'walk around the house for a little time...'},
    {'todo_id': 4, 'todo_name': 'makescoffess', 'todo_derscpion': 'make and drink a coffee..'},
    {'todo_id': 3, 'todo_name': 'meditate', 'todo_derscpion': 'meditate for 30mins...'},
    {'todo_id': 5, 'todo_name': 'running', 'todo_derscpion': 'Go for a run in the park....'}
]

@api.get('/')
def home():
    return {'message': 'Welcome to my fastapi home page brother...'}

# localhost:9999/todos -> home the above function is returned 
# localhost:9999/todos?first_n=4 -> a querry parameter 
# localhost:9999/todos/2 -> would be a paramerter and passed to the /todos function as a parameter 

@api.get('/todos/{todo_id}')
def get_todo(todo_id):
    for todo in all_todos:
        if todo['todo_id'] == todo_id:
            return {'result': todo}
        
@api.get('/todos')
def get_todo(first_n: int = None):
    if first_n: 
        return all_todos[:first_n]
    else:
        return all_todos
    





# get, post, put, delete

# @api.get('/')
# def index():
#     return {"message": "Hello world.."}

# @api.get('/calculator')
# def calculation():
#     pass
#     return {"message":"hello database."}

# @api.get("/database")
# async def getData():
#     pass 
#     return "pass"