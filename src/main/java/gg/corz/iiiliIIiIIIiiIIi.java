package gg.corz;

import it.unimi.dsi.fastutil.objects.Reference2ByteOpenHashMap;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2682;
import net.minecraft.class_2741;
import net.minecraft.class_7923;
import net.minecraft.class_2350.class_2351;

public final class iiiliIIiIIIiiIIi {
   private static final Reference2ByteOpenHashMap<class_2680> lIililiiil = new Reference2ByteOpenHashMap();
   private static final byte IIililiiil = -1;

   private static boolean IIIllIIliIIl(String p) {
      return p.equals(Illlllllilll<"Illlllllilll","LS71FCBJlENFMiS7WoGRipFLJXmJqKKuJSHTWB1RRwuL">())
         || p.equals(Illlllllilll<"Illlllllilll","24lQ8Ze1a3BRw48V57Z31W0lH9HLEI3dwIQYOtQzBCJy1pD4ov7vnXI=">())
         || p.equals(Illlllllilll<"Illlllllilll","902gLA4KzudT7UBeVyyiVVfHrmBau1ffwqcGDjkMq/NbWQ==">())
         || p.equals(Illlllllilll<"Illlllllilll","mLa1xY6RARs2ygrzDb2hOeOX2VYyUX2qa7utZZk6I1okVZiu2kZS">())
         || p.endsWith(Illlllllilll<"Illlllllilll","rtLtSionhzl9y+CEFGOGJcOk8Dh4PjAQ47gMKkkZk3yLoSxhdlNx">())
         || p.endsWith(Illlllllilll<"Illlllllilll","wzEw1T39u714ILZQN8DoNyXRD6yUyktC72dfaIWkYbc82gUPIKg55g==">());
   }

   private iiiliIIiIIIiiIIi() {
   }

   static {
      lIililiiil.defaultReturnValue((byte)-1);
   }

   private static byte liiiIIllIl(class_2680 state) {
      long var6 = 8232551309735725762L;
      if (state.method_26215()) {
         return illliillIilliill.lIIiliiill;
      } else {
         class_2248 var1 = state.method_26204();

         String var2;
         try {
            var2 = class_7923.field_41175.method_10221(var1).method_12832();
         } catch (Throwable var9) {
            var2 = "";
         }

         class_265 var3;
         try {
            var3 = state.method_26220(class_2682.field_12294, class_2338.field_10980);
         } catch (Throwable var8) {
            var3 = null;
         }

         var6 ^= ((long)(var3 != null && var3.method_1110() ? 1 : 0) << 32 ^ var6) & -1L << 32;
         var6 ^= ((long)(var3 != null && !var3.method_1110() && var3.method_1105(class_2351.field_11052) <= 0.1875 ? 1 : 0) ^ var6) & -1L >>> 32;
         if (var1 == class_2246.field_10343) {
            return illliillIilliill.IliIlllilIi(1, 6);
         } else if (var2.endsWith(Illlllllilll<"Illlllllilll","2RJ4If4/yvsa/2Anqe3A4UlLrlAvJ2rh2Py5f7LVb6U=">())) {
            return illliillIilliill.IliIlllilIi(1, 5);
         } else if (state.method_26227().method_15769()
            || (int)(var6 >>> 32) == 0 && (int)var6 == 0 && var1 != class_2246.field_10382 && var1 != class_2246.field_10164) {
            if (iIlIlllllill(var2)) {
               return illliillIilliill.IliIlllilIi(1, iliIiiliiiii(var2) ? 7 : 9);
            } else if ((int)(var6 >>> 32) != 0 || (int)var6 != 0) {
               return illliillIilliill.IliIlllilIi(1, IilliliilIIi(var2));
            } else if (var1 == class_2246.field_10260) {
               return illliillIilliill.IliIlllilIi(2, 2);
            } else if (var2.startsWith(Illlllllilll<"Illlllllilll","Fja71bvhhG5mNLZvvTBAGHSOugck7ficovAsTRUaSKNTex4rodSANPzINojl">())) {
               return illliillIilliill.IliIlllilIi(2, 1);
            } else if (var1 == class_2246.field_10161 || var1 == class_2246.field_10075) {
               return illliillIilliill.IliIlllilIi(2, 3);
            } else if (var1 == class_2246.field_10620 || var1 == class_2246.field_10132) {
               return illliillIilliill.IliIlllilIi(2, 4);
            } else if (lIiiIiIlilli(var2)) {
               return illliillIilliill.IliIlllilIi(2, 7);
            } else if (IIIllIIliIIl(var2)) {
               return illliillIilliill.IliIlllilIi(2, 10);
            } else if (IlIlllIlilIl(var2)) {
               return illliillIilliill.IliIlllilIi(2, 8);
            } else if (IiIlliIliiIl(var1, state, var2)) {
               return illliillIilliill.IliIlllilIi(2, 11);
            } else {
               return IIlllIlliIll(var2) ? illliillIilliill.IliIlllilIi(2, 9) : illliillIilliill.iIIiliiill;
            }
         } else {
            return illliillIilliill.IlIiliiill;
         }
      }
   }

   private static boolean iliIiiliiiii(String p) {
      return !p.endsWith(Illlllllilll<"Illlllllilll","x/RsN8E4zZtnI+IDgqJe86c2PR6KtJ7E6+cQqmCwV5o=">())
            && !p.startsWith(Illlllllilll<"Illlllllilll","XwPE/t5X7I19yXNG9yVkSXEz3SMqX9U6n5rTtsAfrvs=">())
            && p.contains(Illlllllilll<"Illlllllilll","VDlRIut9p0mjfDQd4ued+wByvZuEUL5kbGA5aMtoEpiUBA==">())
         ? p.contains(Illlllllilll<"Illlllllilll","wi4QXDoi4ur9eDivpTqD3ruN0qlEanBsSxhjfcO6hSlUz5CorEA=">())
            || p.contains(Illlllllilll<"Illlllllilll","IVJWsGX1jTNZB6+Kuj+fcnUz+3GuS68AIv6g2w5oTd4j+GzQkivGqA==">())
            || p.contains(Illlllllilll<"Illlllllilll","4PESFweUeJLjwJMcNJPf/R05/EScVPjAg6thfYfHqVaGG4h1x6Kx">())
            || p.contains(Illlllllilll<"Illlllllilll","i481n2l8Vd3TSJh+jzaxyFZFCA5HFRBWSkKfnItaOZszzYXVRGEkXkhJIQ==">())
            || p.endsWith(Illlllllilll<"Illlllllilll","stwnp75n9dIIQWIEmk9xgRY7jjcjhtoGeCMSXhjgLhygqtY3FCSaPA==">())
            || p.endsWith(Illlllllilll<"Illlllllilll","aXCkYvVhFgOqiGTlBfT06i9zsgaOKfmMUiqPsR45npdJlmjj+jOKrPXC">())
            || p.endsWith(Illlllllilll<"Illlllllilll","Vvghi6wvNZDxK6L9v/LIT7zqzfKFNb1qbPx6UZ1IhhJ2GDS1Gdke6nsHcYM=">())
            || p.endsWith(Illlllllilll<"Illlllllilll","q3k9IPxgr3FmcPOyuOLnNekKQ3UxvHB7ilIOpgsSadwBJRQICi+4+7kVpA==">())
            || p.endsWith(Illlllllilll<"Illlllllilll","gRYG94LjdymtzKk3QdMonzln5d/PIDIsceKvipY25gucObtgUnW1">())
            || p.endsWith(Illlllllilll<"Illlllllilll","SC6sZEfk9nYqreJp3hvbu79SnbiWO7rvp3IbiK16VumzmbAeryvIjI9mfw==">())
         : false;
   }

   private static boolean iIlIlllllill(String p) {
      return p.equals(Illlllllilll<"Illlllllilll","Y6L+v8D7+omPrUQR+QfMrDb05CCHsYQnqo7SRLthopYscw==">())
         || p.equals(Illlllllilll<"Illlllllilll","y+JWRK0bx14k+6JTx6gXXKKclyEFbM0FdyXoQ9D+DOO3n0uWkN+V">())
         || p.endsWith(Illlllllilll<"Illlllllilll","bbKoL7mwRwHmqRaXJOd57j/xd1BXTGe+jjkDemRtOcc=">())
         || p.endsWith(Illlllllilll<"Illlllllilll","zaJG/kPH7NaNUc2erkiLiOz2GDngpMcJGN5Kuhy+ubOdBV8AEoA=">())
         || p.equals(Illlllllilll<"Illlllllilll","PYJZbur58XdQtp3eEU7yLIUlWgQKqNmkEAzM8BYxXPPOz78=">())
         || p.equals(Illlllllilll<"Illlllllilll","V9cBmBZo9vAI9mKiMBtpBkOmZtuTVESnMT+pgSzhRj/gjJjyHd4ASA==">())
         || p.endsWith(Illlllllilll<"Illlllllilll","pojQLLISJSkdaJR6cg+pRXoOkCwIPiIPbjuSLqIq6lOoWeKIg1FwBVRL">())
         || p.endsWith(Illlllllilll<"Illlllllilll","JX1a2bXNH1IBUUpqV4+E1AqERMzDSogbpgmhch9/V0gnZQ==">())
         || p.endsWith(Illlllllilll<"Illlllllilll","tpSoGK2LKlDkqDs4aqEULFdnuT4kMF3kMTuXTC3PJvG8">())
         || p.equals(Illlllllilll<"Illlllllilll","Gf/dE5ctEAmHbbvcfZCXMEMADuN3Slq1GCHYxVjYGAFdrkE=">())
         || p.equals(Illlllllilll<"Illlllllilll","RD1hWboygXWi5U4spbfSR1zZcmKJnHlAPv4yZIh3XktyTvGIkgxSsk4=">())
         || p.endsWith(Illlllllilll<"Illlllllilll","un85z7Ui8AfHb4neKJrgROUPsA9T2iE8p0ocfmo5JA/j">())
         || p.endsWith(Illlllllilll<"Illlllllilll","smXSGvAeLvMzJZF4pQW7j5dZCzBvNMPUp2ojtRPn6yGsUwuEFwE=">())
         || p.startsWith(Illlllllilll<"Illlllllilll","W+jEO/SjYexdHHG7VvHupxHuhhLmJGRi0jVT4KqvHWSGPVc=">());
   }

   private static boolean IiIlliIliiIl(class_2248 state, class_2680 p, String block) {
      if (!block.equals(Illlllllilll<"Illlllllilll","31A3qQzvEWYOWTFQwyICB2bee6NzCfyP9R/qe5Hpbqajb5H+Ilo8">())
         && !block.equals(Illlllllilll<"Illlllllilll","WgMLWHPf2Fgp1eU1/xhi/5OC6P+cmb8OIF7aXSPauFnfWFempmV4P6BvEGla">())) {
         return (state == class_2246.field_28888 || state == class_2246.field_22091) && p.method_28498(class_2741.field_12496)
            ? p.method_11654(class_2741.field_12496) != class_2351.field_11052
            : false;
      } else {
         return true;
      }
   }

   private static boolean IIlllIlliIll(String p) {
      return p.equals(Illlllllilll<"Illlllllilll","KXLfTRssrjBKn41+z+jieyS12wQ38dOw9mDMnq00/BzGSy2RSu/qErCp">())
         || p.endsWith(Illlllllilll<"Illlllllilll","fi40oLzojTT/uyQhhgrWzmaYvjl6zzhS1rvRF1xOnCvcGto=">())
         || p.equals(Illlllllilll<"Illlllllilll","yBjR2pzz5UVhWh6X1GVDNdOJHtUnddg2quUqvq/epXGtww==">())
         || p.contains(Illlllllilll<"Illlllllilll","mj9FAQJUsIFAq/d1Q2cCLlfpxJKz2Nge8CQLwEnCxirJ">())
         || p.equals(Illlllllilll<"Illlllllilll","fPGe3nMqinIacw7j13gSC0v1Y+ryV1RpzmFTmCTHWaZm1JxrBnoUkN6viWw=">())
         || p.endsWith(Illlllllilll<"Illlllllilll","pYZai/to4eF3jYYvJHqSylcTnXOTzgb0FKOf2vtgkMXbeOqh">())
         || p.endsWith(Illlllllilll<"Illlllllilll","/zjzNIKybwWP8aY2uccee3a+rubhseUbSSj5WJbbMJay">())
         || p.endsWith(Illlllllilll<"Illlllllilll","U9AJPyjifoLKj6GnVL92xPuWcTI2DESIFUA/Djk9YLPWDO4=">())
         || p.contains(Illlllllilll<"Illlllllilll","10Yi/ylBW1E4/Flul95jWd7uSELopW9qyD2iJPDBIe8V">())
         || p.endsWith(Illlllllilll<"Illlllllilll","2xGhfR7MxXKVxFZ3lAGRMAMvNXV+mE2wYiPASaB3J4k=">())
         || p.endsWith(Illlllllilll<"Illlllllilll","vgxRZ+tTFheI8dYH9Ru6veQI/gTMQkAhg/Xjbd9tL8dAJOSe">())
         || p.endsWith(Illlllllilll<"Illlllllilll","Y6thbp1XRMnRx7KOSX6hJnS7+PT6PVgWX4FeClDPp58=">())
         || p.equals(Illlllllilll<"Illlllllilll","S1FGvZpprYqBsETHovrJrfi4efqO8LU998iLZfvKcXufWA==">())
         || p.equals(Illlllllilll<"Illlllllilll","GwZFnFg1yvTuBCU3/n9Ab7LfADoTANf0iKEgw2mSro+XI6WkrQ==">())
         || p.equals(Illlllllilll<"Illlllllilll","aY7pHa9Ssvvme289EMJXnHgWL2+t3msl3aCOxAzsXtDDcQQ=">())
         || p.equals(Illlllllilll<"Illlllllilll","MT3eaI+M/sl3hVzrHW59DaB+aS+39HdpYpGPW4yDVMy+vzpE">())
         || p.endsWith(Illlllllilll<"Illlllllilll","3uJlglZT56a9m2NnTIL1FPFdpIelJKwv86MNB8Yv95pKZA==">())
         || p.equals(Illlllllilll<"Illlllllilll","eVjXrsWWcYrALBg0VTHzuqLriuRm1LpjhS+IaFBDCFUS21U71xY=">())
         || p.equals(Illlllllilll<"Illlllllilll","SAjNJWk+d4Ulcq7FOlQazk+9M0yRW3omV0K6oiRH2lFkONI=">())
         || p.equals(Illlllllilll<"Illlllllilll","ZQo422Qt/85A1dHNgb4yw8RZ1l/jsJoMxFuCNI8qhqwINw==">())
         || p.endsWith(Illlllllilll<"Illlllllilll","FG2pRloxOQLrc38un15wFBnfx+k7DyWRu7Xs2sPgey0QM9k=">())
         || p.equals(Illlllllilll<"Illlllllilll","ip9/KCaWUcDSFlNyZyrP2Zu+NReQSkH7d0dkY0WmY9mJctY=">())
         || p.endsWith(Illlllllilll<"Illlllllilll","LmISPTQkXXE7M8jfMzsfMfYJ0iT9QaAon6bRh5kkbOxxsw==">())
         || p.equals(Illlllllilll<"Illlllllilll","8mXEdf3WTrJtLKoQovRZS7CSfCwCGnjxGKvmVX73+pM=">())
         || p.equals(Illlllllilll<"Illlllllilll","YZQgTfhMhdGNS56hcOiZ1eyWMCNdWjLV3DWHSMBAsdimdsweadc=">())
         || p.equals(Illlllllilll<"Illlllllilll","oRlt1FuhMAn557mXQzD19aXgAZKHKwxpesk9W7oZbQ+5E7ougb8T">())
         || p.equals(Illlllllilll<"Illlllllilll","rO7FKPR+kP3wmVb1WpEDonb/9BXC0hqIrGvsPVOjd0k91H5NKqbxWvI=">())
         || p.contains(Illlllllilll<"Illlllllilll","M/NLdItrwbuwUlsmfjfGBcg1+63wr7ehblukQmYKYhUU2Vld">())
         || p.equals(Illlllllilll<"Illlllllilll","QAYO24dP5Y6Ytk5jiSlUQTKagPhOts4Wr9vNN+U9TyztgQQ3qA==">())
         || p.equals(Illlllllilll<"Illlllllilll","OCk8vN1pAVCc9m8m//GrkZ3Zm6Ry/Ka2L6ws+PXoiwWP0SQD76FeD654">())
         || p.equals(Illlllllilll<"Illlllllilll","aFjDW8vyWOreWYIuhD9YuayLMDfb4iCbUAsg7w3amvs7gpzjGg==">())
         || p.equals(Illlllllilll<"Illlllllilll","av6erfnqQKqhdJ9/gRdyacn4kwg2hbXTdPoL4tgQd4VtSg==">())
         || p.equals(Illlllllilll<"Illlllllilll","+XZieFQuHWLFl1hv139vFNzfAFXxu1FRgi1gjTZbc5hr34Z77Q==">())
         || p.equals(Illlllllilll<"Illlllllilll","qiRdCS1zKD+qcxndNcXt6BNipEKDFlkG5Y/6TEZD63TPxQeovdI=">())
         || p.equals(Illlllllilll<"Illlllllilll","TerwDkRFp/38yLnfdojYv65u9396psWtH9nnN9ZW5purTBmjKGU=">())
         || p.equals(Illlllllilll<"Illlllllilll","ZgHneYNXJejeBt701mVNOacshNbkSKETaOvHC3JPT8IwIKMfxs/IRdM=">())
         || p.equals(Illlllllilll<"Illlllllilll","EtG37jv8S3j6x+OCkDMd0QN6cVWjaXSoNgKwv5OgUpPWfz9Uz0KDxv4=">())
         || p.equals(Illlllllilll<"Illlllllilll","Bc7xxMy72Prdepfd1yjjpKx+Er7X6SeZ79MLOGHD3H8rd0Vs1l9v45ukxQ==">())
         || p.endsWith(Illlllllilll<"Illlllllilll","+zldXhwsWiSL+6hwdZXXpri/BokxPr5X8pBSvW2+fbU5">())
         || p.endsWith(Illlllllilll<"Illlllllilll","xfxMFmt+juY1nNMQlRNGbGfsUyWpEPixzyp5h351XCOb">());
   }

   private static boolean IlIlllIlilIl(String p) {
      return p.contains(Illlllllilll<"Illlllllilll","WYHFocEMq0GOPVj0w4It3+/bkCQS8O9FKGy+vualrSX10i2ReQ==">())
         || p.equals(Illlllllilll<"Illlllllilll","dkgdKOF45GlQaSPSEFY7VECESNq+4+zwgzjmtFREk3UP1wk6e6c=">())
         || p.equals(Illlllllilll<"Illlllllilll","B8Clav/M1TQIsa9eE+pS8329fFhDk9i6RW1SlUu34Pq5vvx/NnBT5m/Cjg==">())
         || p.equals(Illlllllilll<"Illlllllilll","mbrYarHOidm31yGvQVgtB4G1h8fwwwD6LvvUw0WacE32LfzEkPbM">())
         || p.equals(Illlllllilll<"Illlllllilll","8RCU0P4PSGK1znDDVXpbSnbUoEaDEZyaKk6HYqQyr1Y=">())
         || p.contains(Illlllllilll<"Illlllllilll","r6KwT633bxGy2EkoEnPBVwYHHNm0SQDvnsFpLQbuHVOidg==">())
         || p.contains(Illlllllilll<"Illlllllilll","3tRIbEgW8EFfgcDbcneBwzlrMxC30RkG8r5lDBuSw5h3IW0o">())
         || p.equals(Illlllllilll<"Illlllllilll","mr1L3oV/NptFucVNIh+jIQTznZ0AUz3TMPp3kPhwDvAO2ezr3Ubx">());
   }

   private static boolean lIiiIiIlilli(String p) {
      return p.contains(Illlllllilll<"Illlllllilll","E1UaTQJnhLwe+v39Qf6DaOWPlj50oV/egzsCBxmrkFUaAicmiGCB">())
         || p.contains(Illlllllilll<"Illlllllilll","8eez8m3zDFK5Tvw6uztJulyeffTOq24scMTlk8x6XY8/wQnGcw98iDvaQA==">())
         || p.contains(Illlllllilll<"Illlllllilll","4QSX64Y0cwwTInFLKK38mh7CNBX/FOa5NiLMMhE/fjNWDvq1Oo/Vcg4D">())
         || p.contains(Illlllllilll<"Illlllllilll","6RU7oFMND7rBqF0Yl9NQ7gRXGzn6GSx0z6e3q9JSBLQKYJyrGVs=">())
         || p.startsWith(Illlllllilll<"Illlllllilll","hkQLiI5QXUFbTzDeVwE8cKQzc+8DrqBShWB+xr7aExhp111DOspI/9E=">())
         || p.startsWith(Illlllllilll<"Illlllllilll","sBOS1jyUreMIMwlS2+lI69CvDWg1/IrCCyLsye6ET6C3u1nwHL9ttqI=">())
         || p.equals(Illlllllilll<"Illlllllilll","hiDpOQ7BFSluEEpzTHosxWoBqNQ0RVqEdHrvwlY42Vk/g036VU5aRAikkeVy4A==">())
         || p.equals(Illlllllilll<"Illlllllilll","VGKzY5Mcs5AKFbvJtKLIbThT1bPjaR8TqQt/EKYi/ZBCz0sxHyEbz7e2XV/fzSim">())
         || p.contains(Illlllllilll<"Illlllllilll","0ANn+d7nPj25N/CWoonAk/eH0csHhQvT+ZWIIwlQsf8M">())
         || p.equals(Illlllllilll<"Illlllllilll","GtYRBlDDlEH1aV/9gSb3GNpFsa8cFnzjoGtBMqPRIh3vC45g2vZ6KlloCbM=">())
         || p.contains(Illlllllilll<"Illlllllilll","OHiqSes8zoR+5MLL0v9XnlKbm8LezsYlmXHHVvIxlG5yWhnJ">())
         || p.equals(Illlllllilll<"Illlllllilll","SgLi5qP8I8hsjWfVk9mNCr4I1+3F630fSQZZnfzulsdGBcU=">())
         || p.equals(Illlllllilll<"Illlllllilll","KzeR61KQpKwtoou+axiE1kim19EHpexqKMdjCExftYxgwqKaKTQWZ4I=">())
         || p.startsWith(Illlllllilll<"Illlllllilll","PSK0Wip402Wigxq3MBBlxT/zj1c1LiS8t+iRHaAu1FVJn6lz4A==">())
         || p.equals(Illlllllilll<"Illlllllilll","nLFaFDu/7Maa53Th2oNrobsB8UxdMd+xEnUKfNg4pc6GLyno2Q==">())
         || p.equals(Illlllllilll<"Illlllllilll","cMfZfFpGRajXk9JpyXVjY2uM1XtSBioVd6hCAKfxlLq0GmAB+WkEJWI=">())
         || p.equals(Illlllllilll<"Illlllllilll","J9/VASDdqmRovC+IynQ/cpy/y9mEsUQrHBkECa8dEOgU">())
         || p.contains(Illlllllilll<"Illlllllilll","H5mnMLhkvRaoKz+wOjjGxyhVxSTIVLVlWZYLeoO3PboAIB+ygTA=">())
         || p.contains(Illlllllilll<"Illlllllilll","VFPFdLiygyW/RUZ5IAzmw0eI6H8ppbcj3xGh6u+9YxJR+A==">())
         || p.contains(Illlllllilll<"Illlllllilll","bxOZjAovvqa8Hl5J1OuqPMdhG8pxyDeU7eHgl6jFZS1mK08xVolyTA==">())
            && !p.startsWith(Illlllllilll<"Illlllllilll","AVrZD2SuEYOF+htDfI0mqCycsKVe2wePGQ9cC/UATu4=">())
         || p.startsWith(Illlllllilll<"Illlllllilll","ESufpxV828m9QklrPX4rlPGD4Sijeau5OiiltN0ZCZrFCjHtb4YptXmAh/LXoBT/H6yBexE=">())
         || p.equals(Illlllllilll<"Illlllllilll","Y8vwBJPDw6OY6+urYx4QeX8Qoaz/QDjLFaXFA8okhrNc6/g+luwKZjCllYqC">())
         || p.startsWith(Illlllllilll<"Illlllllilll","vMoJ969pPhKpmfqOX+vT1KHF0MVftnbwH0yZV+Fr8ESs+oeIUJK6">())
         || p.equals(Illlllllilll<"Illlllllilll","27lmrswd+xwWjtpZmXoSu4aEKOasD4CoMlt35H4C017YLdts+Z7yNSjD3C05nw==">())
         || p.equals(Illlllllilll<"Illlllllilll","AI6Yi1ECkxFpA0HOiDzRp79eEo3sLEV3ly+EgzDty7of2aZahUFI0MEmdw==">())
         || p.equals(Illlllllilll<"Illlllllilll","AeOl8Z/4JJHFUG/WPkAnrRLoytEBGFUUHeS76Fvc5w==">())
         || iliIiiliiiii(p);
   }

   private static int IilliliilIIi(String p) {
      if (p.contains(Illlllllilll<"Illlllllilll","0ANn+d7nPj25N/CWoonAk/eH0csHhQvT+ZWIIwlQsf8M">())) {
         return 7;
      } else if (p.contains(Illlllllilll<"Illlllllilll","PTClD5PEvv8ae9ZVCx3zLR7ZoKvSOLyDMZst2SEdoC0b/g==">())
         || p.contains(Illlllllilll<"Illlllllilll","3RLWZQNn5iBvES4n6hStvq/hBjGIL758EqrCVU663DE=">())
         || p.equals(Illlllllilll<"Illlllllilll","02qgxAAnvhT3e+kQ5fj+eUjcLbyxHrQcYXLZaPgD5+o3Ku45EiwcTA0=">())
         || p.equals(Illlllllilll<"Illlllllilll","Pmu75HbBmvdTh9aQsj6ZPJiHZz66LieSQQBsd02X/+E96zRqCVsmj4c=">())
         || p.contains(Illlllllilll<"Illlllllilll","YDAyJ12hCudsc191FaUeCuyw/8qZtNrN7EuOi2NOX49Stv0/FIZC">())
         || p.contains(Illlllllilll<"Illlllllilll","3tRIbEgW8EFfgcDbcneBwzlrMxC30RkG8r5lDBuSw5h3IW0o">())
         || p.contains(Illlllllilll<"Illlllllilll","WYHFocEMq0GOPVj0w4It3+/bkCQS8O9FKGy+vualrSX10i2ReQ==">())) {
         return 8;
      } else {
         return !p.endsWith(Illlllllilll<"Illlllllilll","un85z7Ui8AfHb4neKJrgROUPsA9T2iE8p0ocfmo5JA/j">())
               && !p.contains(Illlllllilll<"Illlllllilll","9kYGao5ujFJ+3r2pQQdUOavLInUu3mN+sdVw8CqlU6k=">())
               && !p.contains(Illlllllilll<"Illlllllilll","j7SKtkkywjrPWg6x037aFFTQ3kdWzuuzt99F2ZY+BeBCIA==">())
               && !p.endsWith(Illlllllilll<"Illlllllilll","3A0zbxN7/bagDiJD5NL/mk780DoDhUqkicWkq2qJmOavlA==">())
               && !p.equals(Illlllllilll<"Illlllllilll","BJWmLporfTkWz8SxLjBi0HO0vbCeRAcvZK4P4G2eWW25">())
               && !p.endsWith(Illlllllilll<"Illlllllilll","PreXobeIwQBoh2QL4/djwbgbWkmQUgnjhXSpaIFSCa5FHK1Y5Pn6vvrv">())
               && !p.endsWith(Illlllllilll<"Illlllllilll","rr4blVSzAEBJKDoSnUHjV+f8cseuSAJpki19UlXY5KIYcg==">())
               && !p.equals(Illlllllilll<"Illlllllilll","AWxhMeLwisAr/s/CFr++a9g0HtERSSjY0mvNLTEjMra5SzyZinb6W7c=">())
               && !p.equals(Illlllllilll<"Illlllllilll","vhwAryJa6F9WQ72r99tgwnAiRv9GxJgOPb0Q7p1zzpuaB9Kj">())
               && !p.equals(Illlllllilll<"Illlllllilll","OEMxxC7v82aeINPB9U1Oj7jLTv2uJOYIA540PwoKUVGtxTqvIVY=">())
               && !p.startsWith(Illlllllilll<"Illlllllilll","884MZRgTtkbxNKjYzeVzQTqYxtkPZosyTPNmf21mmQVkKmcz">())
               && !p.endsWith(Illlllllilll<"Illlllllilll","Y6thbp1XRMnRx7KOSX6hJnS7+PT6PVgWX4FeClDPp58=">())
            ? 0
            : 9;
      }
   }

   public static byte IliIlllilIi(class_2680 state) {
      long var2 = -8977452333830930830L;
      var2 ^= ((long)lIililiiil.getByte(state) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) == -1) {
         var2 ^= ((long)liiiIIllIl(state) << 32 ^ var2) & -1L << 32;
         lIililiiil.put(state, (byte)((int)(var2 >>> 32)));
      }

      return (byte)((int)(var2 >>> 32));
   }
}
