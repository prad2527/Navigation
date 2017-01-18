package com.example.user.navigation;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    //Defining Variables
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Initializing Toolbar and setting it as the actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initializing NavigationView
        navigationView = (NavigationView)
                findViewById(R.id.navigation_view);

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener
                (new NavigationView.OnNavigationItemSelectedListener() {

                    // This method will trigger on item Click of navigation menu
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {


                        //Checking if the item is in checked state or not, if not make it in checked state
                        if(menuItem.isChecked())
                            menuItem.setChecked(false);
                        else
                            menuItem.setChecked(true);

                        //Closing drawer on item click
                        drawerLayout.closeDrawers();

                        //Check to see which item was being clicked and perform appropriate action
                        switch (menuItem.getItemId()){


                            //Replacing the main content with ContentFragment Which is our Inbox View;
                            case R.id.inbox:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                ContentFragment fragment = new ContentFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransaction
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransaction.replace(R.id.frame,fragment);
                                fragmentTransaction.commit();
                                return true;


                            case R.id.amstrong_no:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                AmstrongNoFragment fragmentamstrong = new AmstrongNoFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactionamstrong
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactionamstrong.replace(R.id.frame,fragmentamstrong);
                                fragmentTransactionamstrong.commit();
                                return true;

                            case R.id.character_demo:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                CharacterDemoFragment fragmentcharacter = new CharacterDemoFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactioncharcter
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactioncharcter.replace(R.id.frame,fragmentcharacter);
                                fragmentTransactioncharcter.commit();
                                return true;

                            case R.id.circle_area:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                CircleAreaFragment fragmentcircle = new CircleAreaFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactioncircle
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactioncircle.replace(R.id.frame,fragmentcircle);
                                fragmentTransactioncircle.commit();
                                return true;


                            case R.id.even_odd:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                EvenOddFragment fragmenteven = new EvenOddFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactioneven
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactioneven.replace(R.id.frame,fragmenteven);
                                fragmentTransactioneven.commit();
                                return true;

                            case R.id.company_insurance:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                CompanyInsuranceFragment fragmentcompany = new CompanyInsuranceFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactioncompany
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactioncompany.replace(R.id.frame,fragmentcompany);
                                fragmentTransactioncompany.commit();
                                return true;

                            case R.id.company_driver:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                CompanyDriverFragment fragmentdriver = new CompanyDriverFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactiondriver
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactiondriver.replace(R.id.frame,fragmentdriver);
                                fragmentTransactiondriver.commit();
                                return true;

                            case R.id.compound_interest:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                CompoundInterrestFragment fragmentinterest = new CompoundInterrestFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactioninterest
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactioninterest.replace(R.id.frame,fragmentinterest);
                                fragmentTransactioninterest.commit();
                                return true;

                            case R.id.fernament_centegrade:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                ConvertFernamentToCentigradeFragment fragmentconvert = new ConvertFernamentToCentigradeFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactionconvert
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactionconvert.replace(R.id.frame,fragmentconvert);
                                fragmentTransactionconvert.commit();
                                return true;

                            case R.id.feet_inches:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                FeetInchesFragment fragmentfeet = new FeetInchesFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactionfeet
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactionfeet.replace(R.id.frame,fragmentfeet);
                                fragmentTransactionfeet.commit();
                                return true;


                            case R.id.gross_salary:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                GrossSalaryFragment fragmentgross = new GrossSalaryFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactiongross
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactiongross.replace(R.id.frame,fragmentgross);
                                fragmentTransactiongross.commit();
                                return true;


                            case R.id.simple_interest:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                SimpleInterestFragment fragmentsimple = new SimpleInterestFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactionsimple
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactionsimple.replace(R.id.frame,fragmentsimple);
                                fragmentTransactionsimple.commit();
                                return true;


                            case R.id.steel_demo:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                SteelDemoFragment fragmentsteel = new SteelDemoFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactionsteel
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactionsteel.replace(R.id.frame,fragmentsteel);
                                fragmentTransactionsteel.commit();
                                return true;


                            case R.id.telephone_bill:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                SteelDemoFragment fragmentbill = new SteelDemoFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactionbill
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactionbill.replace(R.id.frame,fragmentbill);
                                fragmentTransactionbill.commit();
                                return true;


                            case R.id.arithmatic_opration:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                ArithmaticOprationFragment fragmentopration = new ArithmaticOprationFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactionopration
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactionopration.replace(R.id.frame,fragmentopration);
                                fragmentTransactionopration.commit();
                                return true;

                            case R.id.array_opration:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                ArrayOprationFragment fragmentarray = new ArrayOprationFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactionarray
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactionarray.replace(R.id.frame,fragmentarray);
                                fragmentTransactionarray.commit();
                                return true;

                            case R.id.no_notes:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                NoOfNotesFragment fragmentnotes = new NoOfNotesFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactionnotes
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactionnotes.replace(R.id.frame,fragmentnotes);
                                fragmentTransactionnotes.commit();
                                return true;

                            case R.id.random_no:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                RandomNoFragment fragmentno = new RandomNoFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactionno
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactionno.replace(R.id.frame,fragmentno);
                                fragmentTransactionno.commit();
                                return true;

                            case R.id.string_demo:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                StringDemoFragment fragmentdemo = new StringDemoFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactiondemo
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactiondemo.replace(R.id.frame,fragmentdemo);
                                fragmentTransactiondemo.commit();
                                return true;


                            case R.id.two_diamentional:
                                Toast.makeText(getApplicationContext(),"Inbox Selected",
                                        Toast.LENGTH_SHORT).show();
                                TwoDiamentionalFragment fragmenttwo = new TwoDiamentionalFragment();
                                android.support.v4.app.FragmentTransaction fragmentTransactiontwo
                                        = getSupportFragmentManager().beginTransaction();
                                fragmentTransactiontwo.replace(R.id.frame,fragmenttwo);
                                fragmentTransactiontwo.commit();
                                return true;


                            //
                            // For rest of the options we just show a toast on click

                            case R.id.starred:
                                Toast.makeText(getApplicationContext(),"Stared Selected",Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.sent_mail:
                                Toast.makeText(getApplicationContext(),"Sent Mail",
                                        Toast.LENGTH_SHORT).show();
                                SendMailFragment smfragment = new SendMailFragment();
                                android.support.v4.app.FragmentTransaction smfragmentTransaction
                                        = getSupportFragmentManager().beginTransaction();
                                smfragmentTransaction.replace(R.id.frame,smfragment);
                                smfragmentTransaction.commit();
                                return true;

                            case R.id.drafts:
                                Toast.makeText(getApplicationContext(),"Drafts Selected",Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.allmail:
                                Toast.makeText(getApplicationContext(),"All Mail Selected",Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.trash:
                                Toast.makeText(getApplicationContext(),"Trash Selected",Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.spam:
                                Toast.makeText(getApplicationContext(),"Spam Selected",Toast.LENGTH_SHORT).show();
                                return true;
                            default:
                                Toast.makeText(getApplicationContext(),"Somethings Wrong",Toast.LENGTH_SHORT).show();
                                return true;

                        }
                    }
                });

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle
                = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.openDrawer, R.string.closeDrawer)
        {

            @Override
            public void onDrawerClosed(View drawerView)
            {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView)
            {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}
