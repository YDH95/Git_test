# Git_test

체리픽 사용밥
1.소스가 있는 해당소스의 git 폴더로 이동(ex)~/git/becon_cloud_sub)

2.commit을 옮기고 싶은 브랜치로 checkout
-> git checkout branch명
ex)git checkout feature/2023_4Q

3. commit 코드로 체리픽.(머지된 커밋ID 아니고 원래의 단일 커밋)
-> git cherry-pick 857c5a6
커밋이 여러개 일경우 -> git cherry-pick 0d12689 0d12689 0d12689

4. 옮기고 싶은 브랜치로 push 하기
git push -u origin branch명
ex)git push -u origin feature/2023_4Q

5.bitbucket ID/PW 입력하기

6.bitbucket에서 확인하기 
개인저장소 -> 옴기고자 하는 브랜치로 커밋생성(승인 후 bitbucket에서 머지) 

7. git bash 끄지말고 git checkout master 입력 해주기
경로가 ~/git/becon_cloud_sub (master) 로뜨는거 확인후 종료
