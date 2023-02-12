def get_next_positions(pos):
moves = [(2,1),(2,-1),(-2,1),(-2,-1),(1,2),(-1,2),(1,-2),(-1,-2)]
i,j = pos
position = set()
for(x,y)in moves:
pos_x = i+x
pos_y = j+y
if(1<= pos_x)and (pos_x <= 100) and (1<= pos_y)and (pos_y<=100):
position.add((pos_x,pos_y))
return position

i,j,n = [int(x)for x in input().split()]
curr_positions = set([(i,j)])
for i in range(n):
new_position = set()
for pos in curr_positions:
new_position |= get_next_positions(pos)
curr_positions = new_position
print(len(curr_positions))
