package javajump8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pg8_parking {

	public static void main(String[] args) throws IOException {
			// pg8 거리계산
			double distMax = 0.0;
			double distMin = 0.0;
			
			
			File f = new File("C:\\Users\\kopo\\Desktop\\한국교통안전공단_전국공영주차장정보_20191224.csv");
			BufferedReader br = new BufferedReader (new FileReader(f));
			
			String readtxt;
			
			if((readtxt = br.readLine()) == null) {
				System.out.println("빈 파일입니다.");
				return;
			}
			
			String[] field_name = readtxt.split(",");
			
			//융합기술 우리집 위도경도 
			double lat = 37.3860521;
			double lng = 127.1214038;
			
			int LineCnt = 1;
			int maxnumber = 0;
			int minnumber = 0;
			while((readtxt = br.readLine()) != null) { 
				
				String [] field = readtxt.split(",");
				System.out.printf("**[%d번째 항목]***********************\n",LineCnt);
				System.out.printf(" %s : %s\n", field_name[1], field[1]);
				System.out.printf(" %s : %s\n", field_name[2], field[2]);
				System.out.printf(" %s : %s\n", field_name[3], field[3]);
				
				double dist = Math.sqrt(Math.pow(Double.parseDouble(field[3]) - lat,2)
						+ Math.pow(Double.parseDouble(field[2]) -lng, 2));
				
				System.out.printf(" 현재지점과 거리 : %f\n", dist);
				System.out.println("************************************");
				
				if(LineCnt == 1) {
					distMax = dist;
					distMin = dist;
					maxnumber = LineCnt;
					minnumber = LineCnt;
				} else {
					if(dist > distMax) {
						distMax = dist;
						maxnumber = LineCnt;
					}
					if(distMin > dist) {
						distMin = dist;
						minnumber = LineCnt;
					}
				}
				
				LineCnt++;
			}
			
			System.out.printf("[%d번째 항목] 최대거리 : %f", maxnumber, distMax);
			System.out.printf("[%d번째 항목] 최소거리 : %f", minnumber, distMin);		
			
			br.close();
		}

	}