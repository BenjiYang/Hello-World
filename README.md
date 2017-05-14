# hello-world

Edit the branch text.

Just write sth. to sepereate the master branch.


http://www.runoob.com/w3cnote/restful-architecture.html

RESTful 架构详解



















357-done
484 -IP
658 - Holdings - Truncated description
940 -956
643-done



HSBCGDP-484		try to cover different login profile
Step1: Login BB		-> login successfully
Step2:Click to enter Portfolio page		->Navigate to Portfolio page.
Step3:Click the 'Show more filters' link on the left hand side		->The Asset&SubAssets filter is displayed(R1)
Step4: Check the content of Assets and Sub-assets filter.	->The assets&SubAssets in the accounts&SubAccounts(entitled) are selected by default.(R2)
-->Only assets held within the client's accounts/ sub-accounts will be displayed.(R5)
Each Asset can display up to 3 sub-assets before the need to expand to view all sub-assets by clicking on 'View more sub-assets'. This will display all sub-assets within an asset.(R10)

Step5: 3. All assets/ sub-assets available in the client’s portfolio can be selected/deselected
->if the client deselects an asset -> all related sub-assets are deselected(R6)
->if the client selects an asset -> all related sub-assets are selected(R7)
->if the client deselects the last sub-asset within an asset -> the asset is deselected(R8)
Deselect the last sub-asset	the last one sub-asset can not be deselected.
->at least one sub-asset (and related asset) must remain selected(R9)

Step5:4. The assets and sub assets are displayed in the pre-defined order as per the asset classification story		-->Asia eStatement Classification.xlsx

client can collapse the filter section by pressing the arrow "^" and filter title area. When the filter is collapsed only the filter title and arrow will remain visible.(R11)
client can expand the section by pressing the area again.(R12)

Client can see the 'please wait' animation as the data is retrieved and presented in the table(R13)

Responsive variations:
1. the ACs above apply for L, M
2. for S, XS there is a 'Filter Portfolio' button which will display the filter.
3. for S, XS the client can press the 'Show results' to get the results of his selection and close the filter
4. for S, XS, when the user lands on the page, the filter icon on the "Filter Portfolio" button is inactive
5. for S, XS when the user performs a filter selection the filter icon becomes active


HSBCGDP-658	Holdings - Truncated description

Step1:Login BB		->Login successfully
Step2:Click to enter Portfolio page		->Navigate to Portfolio page
Step3:Check the content on holding section		->the content should as below
	The only column where truncation will be applied is the Description column.
Step4:

HSBCGDP-956 
