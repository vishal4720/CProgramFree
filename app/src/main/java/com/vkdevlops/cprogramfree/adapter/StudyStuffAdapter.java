package com.vkdevlops.cprogramfree.adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.vkdevlops.cprogramfree.R;

public class StudyStuffAdapter extends RecyclerView.Adapter<StudyStuffAdapter.MyViewHolder>   {
    Context context;
    String[] data;
    String i = "\u2022 ";
    CardView defination_card;
    TextView defination_title,defination_desc;
    String desc;
    Dialog mDialog;

    public StudyStuffAdapter(Context mContext, String[] s1){
        context = mContext;
        data = s1;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.study_stuff,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        holder.setIsRecyclable(false);
        holder.definations.setText(i.concat(data[position]));




        defination_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position){
                    case 0:
                        defination_title.setText(data[position]);
                        desc ="A "+ data[position] +" is an artificial language which is used to design instructions that are executed by a particular machine(computer) for performing some tasks(evaluation, computation, etc.)";
                        defination_desc.setText(desc);
                        break;

                    case 1:
                        defination_title.setText(data[position]);
                        desc = data[position] +" is a porgramming language in which a list of instructions is given to the computer to follow, in order to perform a task. These instructions are organised into groups which are known as functions(procedures).\nBASIC, BCPL, C, COBOL etc. all are Procedure-Oriented programming language.";
                        defination_desc.setText(desc);
                        break;

                    case 2:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is based on objects, instead of just functions and procedures. These objects are organised into classes, which allow individual objects to be group together, C++, C#, Java etc. all are Object-Oriented programming language.";
                        defination_desc.setText(desc);
                        break;

                    case 3:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is a code which is written by the programmer in human readable form with proper programming syntaxes.";
                        defination_desc.setText(desc);
                        break;

                    case 4:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is the machine understandable code, which can be executed by a machine(OS).";
                        defination_desc.setText(desc);
                        break;

                    case 5:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is a software module which translate(converts) the source code of a program into executable code.";
                        defination_desc.setText(desc);
                        break;

                    case 6:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is a file which contains the declaration of library functions, global variables(defined in other source file) and macro definations.\nExtension of Header file is '.h'\nExample : stdio.h";
                        defination_desc.setText(desc);
                        break;

                    case 7:
                        defination_title.setText(data[position]);
                        desc = "Smallest individual units in a program are known as " + data[position] + ". \nBasically they are the individual words, symbols and punctuation marks.";
                        defination_desc.setText(desc);
                        break;

                    case 8:
                        defination_title.setText(data[position]);
                        desc = data[position] + " are the fixed values that do not change during execution of program.";
                        defination_desc.setText(desc);
                        break;

                    case 9:
                        defination_title.setText(data[position]);
                        desc= data[position] + " is a name given to memory location which can be used to store data.\nEach variable in C has a specific type, which determines the size and layout of the variable's memory.";
                        defination_desc.setText(desc);
                        break;

                    case 10:
                        defination_title.setText(data[position]);
                        desc= data[position] + " is a tagname for a particular entity (e.g : variable, function etc.), which uniquely identifies it.";
                        defination_desc.setText(desc);
                        break;

                    case 11:
                        defination_title.setText(data[position]);
                        desc= data[position] + " gives information about type-definitions (i.e. type of value getting stored in a variable).";
                        defination_desc.setText(desc);
                        break;

                    case 12:
                        defination_title.setText(data[position]);
                        desc= data[position] + " are the reserved words whose meaning are already known to the Compiler.";
                        defination_desc.setText(desc);
                        break;

                    case 13:
                        defination_title.setText(data[position]);
                        desc= data[position] + " are the symbols which perform a predefined operation on operands.";
                        defination_desc.setText(desc);
                        break;

                    case 14:
                        defination_title.setText(data[position]);
                        desc="A statement having valid operators and operand sequence is known as Expression.";
                        defination_desc.setText(desc);
                        break;

                    case 15:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is a way of converting a variable from one data-type(e.g : int) to another data-type(e.g : float).";
                        defination_desc.setText(desc);
                        break;

                    case 16:
                        defination_title.setText(data[position]);
                        desc = "Control or Decision-making statements are the statements in a program which can control the execution order of the statements i.e. the order in which the instructions in a program must be executed.";
                        defination_desc.setText(desc);
                        break;

                    case 17:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is a special type of variable which can store address of another variable.";
                        defination_desc.setText(desc);
                        break;

                    case 18:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is a group of statements which performs a pre-defined task.";
                        defination_desc.setText(desc);
                        break;

                    case 19:
                        defination_title.setText(data[position]);
                        desc = "When a function calls itself, it is known as "+data[position];
                        defination_desc.setText(desc);
                        break;

                    case 20:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is a collection of data having similar data-types.";
                        defination_desc.setText(desc);
                        break;

                    case 21:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is the collection of variable having different data-type, under a single name.";
                        defination_desc.setText(desc);
                        break;

                    case 22:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is one of the derived data-type which allow us to store different type of data(value having different data-types) in the same memory location one ata a time.";
                        defination_desc.setText(desc);
                        break;

                    case 23:
                        defination_title.setText(data[position]);
                        desc = data[position] + " is a way of dealing with data on the secondary storage devices (such as a hard disk) from a program. File Handling operations include opening a file, closing a file, reading a file, writing to a file etc.";
                        defination_desc.setText(desc);
                        break;


                    default:
                        data[position] = "Comming Soon";
                        desc = "Please Wait";
                        defination_desc.setText(desc);
                        break;

                }

                mDialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView definations;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mDialog = new Dialog(context);
            mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            mDialog.setContentView(R.layout.defination_pop);

            defination_title = mDialog.findViewById(R.id.defination_title);
            defination_desc = mDialog.findViewById(R.id.defination_desc);

            definations = itemView.findViewById(R.id.definations);
            defination_card = itemView.findViewById(R.id.defination_card);




        }
    }

}
