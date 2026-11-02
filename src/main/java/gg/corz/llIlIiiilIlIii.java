package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.util.Arrays;
import java.util.Locale;
import net.minecraft.class_1304;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import org.joml.Matrix4f;

public final class llIlIiiilIlIii {
   private static final int IlllIilIIl = 1;
   private static float IIlililIIl;
   private static float IlIllilIIl;
   private static final float iliIIilIIl = 0.08F;
   private static final int iillIilIIl = 6;
   private static Object IliIlilIIl;
   private static final int iIllIilIIl = 0;
   private static final float iiIiIilIIl = 0.75F;
   private static final int[] IIiIlilIIl = new int[128];
   private static float lIIililIIl;
   private static float illililIIl = -1.0F;
   private static final float ilIlIilIIl = 0.8F;
   private static float lliililIIl;
   private static float lilililIIl = -1.0F;
   private static final float IiIiIilIIl = 4.0F;
   private static float iIIililIIl;
   private static final float IiIlIilIIl = 0.86F;
   private static final float iIlIIilIIl = 1.16F;
   private static float IllililIIl;
   private static float liIililIIl;
   private static final float[] IIIIiilIIl = new float[4];
   private static final int IlliIilIIl = 3;
   private static float iiiIlilIIl;
   private static final float lIIiIilIIl = 3.0F;
   private static final float IIiiillIIl = 24.0F;
   private static final int iIliIilIIl = 2;
   private static float llIllilIIl = 1.0F;
   private static final float iilIIilIIl = 17.0F;
   private static boolean iIiIlilIIl;
   private static float iilililIIl = -1.0F;
   private static final float iIIlIilIIl = 460.0F;
   private static final float IIIIIilIIl = 19.0F;
   private static final float lliIIilIIl = 56.0F;
   private static final float lIIlIilIIl = 340.0F;
   private static float IlillilIIl;
   private static final IIliIlllIliIll lllIlilIIl = new IIliIlllIliIll() {
      @Override
      public boolean liiiIIllIl(float button, float mouseX, int mouseY) {
         return llIlIiiilIlIii.IllIllllIl(button, mouseX, mouseY);
      }

      @Override
      public boolean iIlIlllllill(float deltaX, float deltaY, int mouseY, double mouseX, double button) {
         return llIlIiiilIlIii.illIlIilIl();
      }

      @Override
      public boolean IilliliilIIi(float button, float mouseX, int mouseY) {
         return llIlIiiilIlIii.lilIliilIl();
      }

      @Override
      public void IliIlllilIi(class_332 mouseY, float mouseX, float progress, float ctx) {
         llIlIiiilIlIii.ilillIiill(mouseY, mouseX, progress);
      }
   };
   private static final float[] iiiililIIl = new float[4];
   private static boolean IiillilIIl;
   private static final llIllIliilIllIli iiIIlilIIl = new llIllIliilIllIli(
      IilIililIi<"IilIililIi","LKfQE763OvhX3oaFatxNg604w7mGZ6iSpaEfh8zug27+Jvw=">(),
      0,
      IilIililIi<"IilIililIi","ZSby7I1RlJwbiwwuynV4dJpte+VscswKJrEiOQ8qXmGF">(),
      5,
      IllIillllllIilll.class,
      IilIililIi<"IilIililIi","LKfQE763OvhX3oaFatxNg604w7mGZ6iSpaEfh8zug27+Jvw=">(),
      llIlIiiilIlIii.liIIlilIIl,
      false
   );
   private static final int ililIilIIl = 3;
   private static final float[] IIiililIIl = new float[4];
   private static final float[] iIiililIIl = new float[]{-1.0F, -1.0F, -1.0F, -1.0F};
   private static final float IiiiillIIl = 24.0F;
   private static final llIllIliilIllIli iIIIlilIIl = new llIllIliilIllIli(
         IilIililIi<"IilIililIi","lqIBVLNZL7/cfFpQ6e5zw6gW2NQ5Wai5qAzBABy3oQ==">(),
         1,
         IilIililIi<"IilIililIi","9pXswANQwn5MploT0FOy5M9wBREJ00nh2BHpQoTZI8WrEA==">(),
         2,
         iliIliIlIiiIliIl.class,
         IilIililIi<"IilIililIi","1muaPpGr8nAnk10HF23xdoJ9iCw0THniFz3f0uxUJHJaykVFY6w=">(),
         llIlIiiilIlIii.lIIIlilIIl,
         false
      )
      .IiIiliIiiiIi(IilIililIi<"IilIililIi","WgTAgYg/dT2/vrj5S6QIsYphZPxSUufIxkgMJVkMyJvmYyjMBL9/2w==">());
   private static boolean lllllilIIl;
   private static float ilIililIIl;
   private static final llIllIliilIllIli IIlIlilIIl = new llIllIliilIllIli(
      IilIililIi<"IilIililIi","2kOS5V6Q6p1jkgF20AXML3I/S8fSJIPYEUYExNXal7YxSg==">(),
      1,
      IilIililIi<"IilIililIi","wAL7bDZSvLjvELKXud56wuANrKVXjd6eOJoWgS3sCbREXw==">(),
      6,
      IllIIIlilllIIIli.class,
      null,
      null,
      false
   );
   private static float lIillilIIl;
   private static float iIlililIIl;
   private static final String[] IiilIilIIl = new String[]{
      IilIililIi<"IilIililIi","It/WKtaYRqtq050KYMN5T541vt+aoGzeTmSlVb/FDg==">(),
      IilIililIi<"IilIililIi","0W5cziqjabXyZVfG5WgYkocnAwkbPChzbsV/150IlMxwTg==">(),
      IilIililIi<"IilIililIi","behHlqNmvBfaU9GBGHLCJfRH5VDfMUyAPuj5LF5gLpE=">(),
      IilIililIi<"IilIililIi","nbeBZmMNy7w8nhK1VwrKUoLoW73BZPlleg0DJIYfQYfS">()
   };
   private static final float iiiIIilIIl = 0.05F;
   private static final float iIIIIilIIl = 20.0F;
   private static final llIllIliilIllIli ilIIlilIIl = new llIllIliilIllIli(
         IilIililIi<"IilIililIi","RAwU9JaFXDz9kkTxBubi4vLpqLxfSED+fTIgFNkRQDUcr2E67pM=">(),
         2,
         null,
         1,
         iliIliIlIiiIliIl.class,
         IilIililIi<"IilIililIi","hOCGWH1X22JB3Dgp7iM8fKPFiC2pZuV/EhXR7L1Zts8IJk2PFNSU">(),
         llIlIiiilIlIii.lIIIlilIIl,
         false
      )
      .IiIiliIiiiIi(IilIililIi<"IilIililIi","RZ14mJ15d0W0FZKKFFAiJeypPUuKrwWtnBk3xn2yzYHluB3dcrGj6O9rPSCgmdY=">());
   private static final float IliIIilIIl = 34.0F;
   private static llIllIliilIllIli iIlllilIIl;
   private static final float liiIIilIIl = 0.02F;
   private static float lIlililIIl;
   private static float lliIlilIIl;
   private static boolean liillilIIl;
   private static final int liIlIilIIl = 0;
   private static final float lIiIIilIIl = 3.0F;
   private static final llIllIliilIllIli IiIIlilIIl = new llIllIliilIllIli(
      IilIililIi<"IilIililIi","Eii796M4yjO5WV7Esqtf6m2O7sPxOeP1k8XyyCrVrssB0s6dAfU=">(),
      1,
      IilIililIi<"IilIililIi","4/jqLhkE7KmjyKRMBnB6Q06jIxFnF04RlFbmvIhg6uw=">(),
      3,
      iliIliIlIiiIliIl.class,
      IilIililIi<"IilIililIi","hh9ZL48i55su6HUm0prlmv19GpFrrRjhHAB2m4hrc3PmyxlrG3zqWlI0EA==">(),
      iIIIlilIIl,
      false
   );
   private static float llillilIIl;
   private static final float iiilIilIIl = 8.0F;
   private static final int IiliIilIIl = 1;
   private static final float IilIIilIIl = 5.0F;
   private static final String IliiIilIIl = "Everything is on";
   private static float iiillilIIl;
   private static float IiIllilIIl;
   private static float IlIililIIl;
   private static float iIIllilIIl;
   private static boolean illllilIIl;
   private static final int liiiIilIIl = -10494866;
   private static final float iIiIIilIIl = 1.2F;
   private static final int illiIilIIl = 0;
   private static final float lIiiillIIl = 24.0F;
   private static final llIllIliilIllIli liIIlilIIl = new llIllIliilIllIli(
      IilIililIi<"IilIililIi","wfnrmwOyEUQxB+4qOIy2HzLU9bzrfKnokpQaRvx60w==">(),
      1,
      IilIililIi<"IilIililIi","PrQ2XQBGgFivghS2RE7uUeVVaVaJinzEMz2GatTnVg==">(),
      4,
      IllIillllllIilll.class,
      null,
      null,
      true
   );
   private static final lIIiIlliIIiIll illIlilIIl = new lIIiIlliIIiIll() {
      @Override
      public boolean liiiIIllIl(double realX, double realY) {
         return llIlIiiilIlIii.IIiIllIiIl((float)realX, (float)realY) != null;
      }

      @Override
      public void IilliliilIIi(double realX, double button, int realY) {
         llIlIiiilIlIii.lliIliliIl((float)realX, (float)button);
      }

      @Override
      public void lIiiIiIlilli(double realX, double button, int realY) {
         llIlIiiilIlIii.IiiIlliiIl((float)realX, (float)button);
      }

      @Override
      public void IliIlllilIi(class_332 progress, float ctx) {
         llIlIiiilIlIii.iiIilIIlil(progress, ctx);
      }

      @Override
      public boolean iIlIlllllill(double button, double realY, int realX) {
         return llIlIiiilIlIii.iIiIlIliIl((float)button, (float)realY, realX);
      }
   };
   private static final float illIIilIIl = 0.82F;
   private static final int IIliIilIIl = 0;
   private static final float IIiIIilIIl = 0.92F;
   private static final float IliiillIIl = 10.0F;
   private static final float IIIlIilIIl = 300.0F;
   private static final float IlIlIilIIl = 24.0F;
   private static final int liliIilIIl = 2;
   private static final int llliIilIIl = 4;
   private static final int lIliIilIIl = 1;
   private static final int IlilIilIIl = 1;
   private static final float[] liiililIIl = new float[4];
   private static final class_4587 IilIlilIIl = new class_4587();
   private static llIllIliilIllIli lIlllilIIl;
   private static float IIIililIIl;
   private static final float lIIIIilIIl = 52.0F;
   private static final float IIIiIilIIl = 22.0F;
   private static int IiiIlilIIl = -1;
   private static boolean ilillilIIl;
   private static float iiIllilIIl;
   private static int IiiililIIl = 0;
   private static float IilililIIl = -1.0F;
   private static final float iIIiIilIIl = 13.0F;
   private static final int IIIIlilIIl = -2077877;
   private static final float IiiIIilIIl = 0.11F;
   private static class_2960 iliIlilIIl;
   private static final int lillIilIIl = 5;
   private static final int llllIilIIl = 2;
   private static float IIillilIIl;
   private static final int IillIilIIl = 4;
   private static final float iliiillIIl = 35.0F;
   private static float liiIlilIIl;
   private static final int iiIlIilIIl = 1;
   private static final float IllIIilIIl = 14.0F;
   private static float IilllilIIl;
   private static final int lIllIilIIl = 3;
   private static final float lIlIIilIIl = 1.0F;
   private static float lIIllilIIl;
   private static final llIllIliilIllIli lIlIlilIIl = new llIllIliilIllIli(
      IilIililIi<"IilIililIi","DJu8ZTF9lyvFF6lnVLIL/gvFcZzUvzTR1xRTFIai7RIkazDr">(),
      1,
      IilIililIi<"IilIililIi","DE3a0guC8NcwPxATmj+sWwMncxN/szm/t4ux+6U1X/ae">(),
      7,
      lIIllIIiiIIllIIi.class,
      null,
      null,
      false
   );
   private static final float llIlIilIIl = 1.12F;
   private static float lllililIIl = 1.0F;
   private static final float liiiillIIl = 4.0F;
   private static final llIllIliilIllIli lIIIlilIIl = new llIllIliilIllIli(
         IilIililIi<"IilIililIi","O7Yo2XNWv9U4Tukind/UPQWXFKmemiYXLT6NUoiNEJjofY2y">(),
         0,
         IilIililIi<"IilIililIi","72R5ILJWwlRMlpMFvJoAnGV+Zo8NmdO98PjpZEn5oAt5Dw==">(),
         0,
         iliIliIlIiiIliIl.class,
         null,
         null,
         false
      )
      .IiIiliIiiiIi(IilIililIi<"IilIililIi","x1ng3MhRzBiIpQsSkSFfZlE41tU6mE0Xz1OdTE7mlt7Gzl1MlevwMuk=">());
   private static final float ilIIIilIIl = 11.0F;
   private static float IIIllilIIl;
   private static float IiIililIIl;
   private static final float[] lIiililIIl = new float[]{-1.0F, -1.0F, -1.0F, -1.0F};
   private static final float iiIIIilIIl = 5.0F;
   private static final liIilliiiIilli[] IllIlilIIl = new liIilliiiIilli[]{
      new liIilliiiIilli(), new liIilliiiIilli(), new liIilliiiIilli(), new liIilliiiIilli(), new liIilliiiIilli(), new liIilliiiIilli()
   };
   private static final String IiiiIilIIl = "Release to remove";
   private static float ilIllilIIl = 87.0F;
   private static final float[] lIIIiilIIl = new float[2];
   private static final float lilIIilIIl = 12.0F;
   private static final String iliiIilIIl = "Release to add";
   private static final int illlIilIIl = 3;
   private static float IIlllilIIl = 0.8F;
   private static final String lIiiIilIIl = "Elements";
   private static final float iIiiillIIl = 112.0F;
   private static final float llIiIilIIl = 0.78F;
   private static final int IIllIilIIl = 2;
   private static final llIllIliilIllIli[] iIlIlilIIl = new llIllIliilIllIli[]{
      lIIIlilIIl, iIIIlilIIl, llIlIiiilIlIii.IlIIlilIIl, ilIIlilIIl, IiIIlilIIl, liIIlilIIl, iiIIlilIIl, IIlIlilIIl, lIlIlilIIl
   };
   private static boolean iiIililIIl;
   private static final int IIilIilIIl = 7;
   private static final float llIIIilIIl = 12.0F;
   private static final float ilIiIilIIl = 9.0F;
   private static float liIllilIIl;
   private static final int lIilIilIIl = 8;
   private static final float IlIIIilIIl = 14.0F;
   private static final float lllIIilIIl = 3.0F;
   private static final String[] liilIilIIl = new String[]{
      IilIililIi<"IilIililIi","FTTp1c6GFVbNYgaf9xVVsnWYIBRfbg+oxKCaALWRUTjvbf9azA==">(),
      IilIililIi<"IilIililIi","KU20SmzKGVr3E105KP2qYDtvdRyH/BaNELoglzWcdrl3fmYbFzW8Ig==">(),
      IilIililIi<"IilIililIi","gLMjs36KdVnFr7TmWg/rjEVkPkNQV71X1QkrKexwzTNUeW2zir8=">(),
      IilIililIi<"IilIililIi","pn86TNIfI6tQc9O1NYzzQEb/6Zf2PJ8h/3SD480Pa4F+aFeS65o8">()
   };
   private static float IliililIIl;
   private static float iIillilIIl;
   private static final String iIiiIilIIl = "Drag onto your character";
   private static final int iIilIilIIl = 0;
   private static final int iiiiIilIIl = -2045912;
   private static final String lliiIilIIl = "your character";
   private static final float liIiIilIIl = 0.6F;
   private static boolean IllllilIIl;
   private static float lilllilIIl;
   private static final float IiIIIilIIl = -11.0F;
   private static final llIllIliilIllIli IlIIlilIIl = new llIllIliilIllIli(
         IilIililIi<"IilIililIi","EgU16aJPbEz6FdyUyML/F6k8yrDfQd3YA+42eeBvHXKhTZ4=">(),
         3,
         IilIililIi<"IilIililIi","hnT1cZtoFaJ7JaNgGz++2Z/pwGxbG4uvmoBOu6SUC061">(),
         8,
         iliIliIlIiiIliIl.class,
         IilIililIi<"IilIililIi","Ci4VC1O3HZf5BYlbkMH0Jmzpu2e7bAKmMamKmN5KabPMwNLvQpyuRQ==">(),
         lIIIlilIIl,
         false
      )
      .IiIiliIiiiIi(IilIililIi<"IilIililIi","wSNqM5yKqGsqMvI1c4lT9/Xv9/1dlJfjgwYrl+wDnrrmfg76O45Qv5LV/bo=">());
   private static final float IlIiIilIIl = 12.0F;
   private static final Color[] lIiIlilIIl = new Color[128];
   private static int iliililIIl = -1;
   private static final String[] iiliIilIIl = new String[]{
      IilIililIi<"IilIililIi","bX03SG3q3ydm/38c2FzvzfJ1Obn87aNP9KXS8EU7hyOpEiahSdCjaA==">(),
      IilIililIi<"IilIililIi","UVYu5rIKMxomwwfN88My+EY0Lcj/4dSqM+LmYKzLs16Baf7Dn4s=">(),
      IilIililIi<"IilIililIi","Mq9AMj4Rs3ZrZ3ncuwqkAYyRJs8xUAqU1XoDu7r5GEgfwkYzOu0=">(),
      IilIililIi<"IilIililIi","Rkfwa+O4dppaQVT7kc0eQ98FTHjX/Kt+5AMGHpFl8+NeOmSxXO0=">(),
      IilIililIi<"IilIililIi","EmJvnkKJ6lizkGF2wDn9dGnVhAUhg2+2Iug9KFnRI+Rmzzux">()
   };
   private static final float[] iilIlilIIl = new float[2];
   private static final float iiiiillIIl = 6.0F;
   private static float llIililIIl;
   private static final String[] IIiiIilIIl = new String[]{
      IilIililIi<"IilIililIi","ovfo8WmTuA7dg9s2dDZ+zg+cIpeWZ1xspe2oB61Ae9w=">(),
      IilIililIi<"IilIililIi","4QpA9DIpKPkOehySIin8+iSLNlLvFV9ZBfsaUueo4N5trf0=">(),
      IilIililIi<"IilIililIi","3NQjbnAFn9CVgXQW/gjqyiIpaugT2N17XTgF5nKYZZK3KA==">(),
      IilIililIi<"IilIililIi","Rkfwa+O4dppaQVT7kc0eQ98FTHjX/Kt+5AMGHpFl8+NeOmSxXO0=">(),
      IilIililIi<"IilIililIi","EmJvnkKJ6lizkGF2wDn9dGnVhAUhg2+2Iug9KFnRI+Rmzzux">()
   };
   private static final int llilIilIIl = 2;
   private static final float lliiillIIl = 7.0F;
   private static float iilllilIIl;
   private static final float[] lilIlilIIl = new float[2];
   private static final float IIlIIilIIl = 0.7F;
   private static final float liIIIilIIl = 4.0F;

   private static float IIlilIliiIli(float grow, float h, float gap) {
      float var3 = gap > 0.0F ? 1.0F : 0.0F;
      IiIiliIiiiIi(1, IIIIiilIIl);
      float var4 = IIIIiilIIl[1] + IIIIiilIIl[3] - iIIililIIl;
      if (iIIililIIl + h + var4 * var3 + grow <= lIIllilIIl - 6.0F) {
         return iIIililIIl + h + var4 * gap;
      } else {
         IiIiliIiiiIi(0, IIIIiilIIl);
         float var5 = IIIililIIl - IIIIiilIIl[1];
         return IIIililIIl - h - var5 * var3 - grow >= 6.0F
            ? IIIililIIl - h - grow - var5 * gap
            : Math.min(iIIililIIl + h + var4 * gap, lIIllilIIl - grow - 6.0F);
      }
   }

   public static boolean lIIIiiIIIi(String name, boolean close, float[] out) {
      llIllIliilIllIli var3 = Iiiilliiil(name);
      if (var3 != null && var3.iiIIlIllIi && !(var3.IliIlIllIi < 0.5F) && !(var3.iliIlIllIi <= 0.0F)) {
         out[0] = close ? var3.llIllIllIi + var3.iliIlIllIi - 6.0F : var3.llIllIllIi + (var3.iliIlIllIi - 12.0F) * 0.5F;
         out[1] = var3.ilIllIllIi + 7.0F;
         return true;
      } else {
         return false;
      }
   }

   private static void Illlllllilll() {
      IIliIlllIliIll var0 = iIIlIllIlIlIll.IlIillIiilIi();
      float var1 = IIIllilIIl * 0.355F;
      float var2 = lIIllilIIl * 0.3F;
      float var3 = 0.8F;
      if (var0.iliIiIlilIiiIiIlil > 1.0F && iIIlIllIlIlIll.illilIilil(var0, var0.iilIiIlilIIiIiIlil, var0.lIiIiIliliIiIiIlil, lilIlilIIl)) {
         float var4 = lilIlilIIl[0];
         float var5 = lilIlilIIl[1];
         if (iIIlIllIlIlIll.illilIilil(var0, var0.iilIiIlilIIiIiIlil, var0.lIiIiIliliIiIiIlil + var0.iliIiIlilIiiIiIlil, lilIlilIIl)) {
            float var6 = lilIlilIIl[1];
            var1 = Math.min(var4, lilIlilIIl[0]) - 5.0F;
            var2 = var5 + (var6 - var5) * 0.13F;
            var3 = class_3532.method_15363((var6 - var5) / var0.iliIiIlilIiiIiIlil * 1.16F, 0.7F, 1.0F);
         }
      }

      IIlllilIIl = var3;
      lllIlilIIl.iilIiIlilIIiIiIlil = 24.0F;
      lllIlilIIl.lIiIiIliliIiIiIlil = 24.0F;
      lllIlilIIl.IliIiIlillliIiIlil = 112.0F;
      lllIlilIIl.iliIiIlilIiiIiIlil = Math.min(ilIllilIIl, Math.max(40.0F, lIIllilIIl - 48.0F));
      lllIlilIIl.liiIiIliliiiIiIlil = 10.0F;
      lllIlilIIl.llIliIlililIliIlil = var3;
      lllIlilIIl.IiIliIlilliIliIlil = -11.0F;
      lllIlilIIl.iiIliIlilIIlliIlil = 4.0F;
      lllIlilIIl.IllliIlillllliIlil = IilIIIIililIIIIi.liiiIIllIl() && Iiliililliliilil.lIlillllil ? 1.0F : 0.0F;
      lllIlilIIl.IIIliIlillIIliIlil = var1 - 112.0F * var3 * 0.5F;
      lllIlilIIl.iIIliIlilIlIliIlil = var2 + lllIlilIIl.iliIiIlilIiiIiIlil * var3 * 0.5F;
      lllIlilIIl.illliIlilIilliIlil = !iIiIlilIIl;
   }

   private static void IIllllIlll(float w, float y, float h, float x, float r, int fill, int edge) {
      float var7 = IIIiiIillIIiiIil.Illlllllilll();
      IlIllllIll(w, y, h, x, r, edge);
      IlIllllIll(w + var7, y + var7, h - var7 * 2.0F, x - var7 * 2.0F, Math.max(0.0F, r - var7), fill);
   }

   private static void Illillllil(class_332 ctx) {
      long var21 = 5191778253527704145L;
      long var23 = 6795113747182652914L;
      long var25 = 3109792538652783972L;
      long var27 = -724778009838908586L;
      if (!(IiIililIIl <= 0.01F)) {
         float var1 = IliiIilliiIi.IilliliilIIi(IiIililIIl * (1.0F - (iiIililIIl ? 0.75F : 0.6F) * IlIlllIlilIl(IliililIIl)));

         try {
            llIllIliilIllIli[] var2 = iIlIlilIIl;
            var21 ^= ((long)var2.length << 32 ^ var21) & -1L << 32;

            for (long var36 = var21 ^ (0L ^ var21) & -1L >>> 32; (int)var36 < (int)(var36 >>> 32); var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32) {
               llIllIliilIllIli var5 = var2[(int)var36];
               float var6 = IlIlllIlilIl(var5.IliIlIllIi);
               if (!(var6 <= 0.01F) && !(var5.iliIlIllIi <= 0.0F)) {
                  float var7 = var5.llIllIllIi;
                  float var8 = var5.ilIllIllIi;
                  float var9 = var5.iliIlIllIi;
                  long var37 = var23 ^ ((long)(iIlllilIIl == null && lIlllilIIl == null ? 1 : 0) << 32 ^ var23) & -1L << 32;
                  var23 = var37
                     ^ (
                           (long)(
                                 var5.iiIIlIllIi
                                       && var5.IliIlIllIi > 0.5F
                                       && iIIllilIIl >= var7
                                       && iIIllilIIl <= var7 + var9
                                       && IlIllilIIl >= var8
                                       && IlIllilIIl <= var8 + 14.0F
                                    ? 1
                                    : 0
                              )
                              ^ var37
                        )
                        & -1L >>> 32;
                  long var38 = var25 ^ ((long)((int)var23 != 0 && iIIllilIIl >= var7 + var9 - 12.0F ? 1 : 0) << 32 ^ var25) & -1L << 32;
                  var25 = var38 ^ ((long)(lIlllilIIl == var5 && IllllilIIl ? 1 : 0) ^ var38) & -1L >>> 32;
                  var5.IiiIlIllIi = IIIllIIliIIl(var5.IiiIlIllIi, ((int)var23 == 0 || (int)(var23 >>> 32) == 0) && (int)var25 == 0 ? 0.0F : 1.0F, 16.0F);
                  var5.liiIlIllIi = IIIllIIliIIl(
                     var5.liiIlIllIi, ((int)(var25 >>> 32) == 0 || (int)(var23 >>> 32) == 0) && ((int)var25 == 0 || !lllllilIIl) ? 0.0F : 1.0F, 16.0F
                  );
                  float var14 = (0.8F + 0.2F * llilliilililliil.IilliliilIIi(var5.IliIlIllIi, 1.6F))
                     * (1.0F + 0.07F * IiIlliIliiIl(var5.IIIllIllIi))
                     * (1.0F - 0.03F * ((int)var25 != 0 ? 1.0F : 0.0F));
                  float var15 = IliiIilliiIi.IilliliilIIi(var6 * (1.0F - 0.8F * var5.iiiIlIllIi));
                  var27 ^= ((long)llilliilililliil.IlIlllIlilIl(ctx, var7 + var9, var8 + 7.0F, var14) << 32 ^ var27) & -1L << 32;

                  try {
                     liIlliiIll(var7 + 1.0F, var8 + 2.0F, var9 - 2.0F, 14.0F, 5.0F, 1493172224, 5.0F, 0.5F, true);
                     IIllllIlll(
                        var7,
                        var8,
                        var9,
                        14.0F,
                        5.0F,
                        IilIIIIililIIIIi.Illlllllilll(-183495911, -15065561, (double)var5.IiiIlIllIi),
                        IilIIIIililIIIIi.IIlllIlliIll(0.34 + 0.4 * (double)var5.IiiIlIllIi)
                     );
                     lllllillll(
                        var5.IIIllIIliIIl(),
                        var7 + 4.5F,
                        var8 + 3.0F,
                        8.0F,
                        IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.2), -1, 0.25 * (double)var5.IiiIlIllIi)
                     );
                     Iillllilll(
                        var5.IIillIiliIil(),
                        var7 + 16.0F,
                        iliIiiliiiii(var8, 14.0F, 0.82F),
                        0.82F,
                        IilIIIIililIIIIi.Illlllllilll(-5854026, -920587, 0.6 + 0.4 * (double)var5.IiiIlIllIi)
                     );
                     float var17 = var7 + var9 - 12.0F + 0.5F;
                     float var18 = var8 + 2.0F;
                     IlIllllIll(var17, var18, 10.0F, 10.0F, 5.0F, llilliilililliil.IIIIllIIIl(-1750963, 0.2F * var5.liiIlIllIi));
                     lllllillll(
                        iilllIIill(),
                        var17 + 1.5F,
                        var18 + 1.5F,
                        7.0F,
                        IilIIIIililIIIIi.Illlllllilll(-5854026, IilIIIIililIIIIi.Illlllllilll(-1750963, -1, 0.3), (double)var5.liiIlIllIi)
                     );
                  } finally {
                     llilliilililliil.IiIlliIliiIl(ctx, (boolean)((int)(var27 >>> 32)));
                     IliiIilliiIi.lIiiIiIlilli(var15);
                  }
               }
            }
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var1);
         }
      }
   }

   private static void Iilililiiili(float targetX, float targetY) {
      float var2 = (float)Math.exp((double)(-24.0F * liiIlilIIl));
      float var3 = iilllilIIl - targetX;
      float var4 = (lIillilIIl + 24.0F * var3) * liiIlilIIl;
      iilllilIIl = targetX + (var3 + var4) * var2;
      lIillilIIl = (lIillilIIl - 24.0F * var4) * var2;
      float var5 = IIillilIIl - targetY;
      float var6 = (iIillilIIl + 24.0F * var5) * liiIlilIIl;
      IIillilIIl = targetY + (var5 + var6) * var2;
      iIillilIIl = (iIillilIIl - 24.0F * var6) * var2;
   }

   public static void IliIlllilIi() {
      if (!iIiIlilIIl) {
         if (lllIlilIIl.IliIiIlillliIiIlil <= 0.0F) {
            lllIlilIIl.iilIiIlilIIiIiIlil = 24.0F;
            lllIlilIIl.lIiIiIliliIiIiIlil = 24.0F;
            lllIlilIIl.IliIiIlillliIiIlil = 112.0F;
            lllIlilIIl.iliIiIlilIiiIiIlil = ilIllilIIl;
            lllIlilIIl.liiIiIliliiiIiIlil = 10.0F;
            lllIlilIIl.llIliIlililIliIlil = IIlllilIIl;
            lllIlilIIl.IiIliIlilliIliIlil = -11.0F;
            lllIlilIIl.iiIliIlilIIlliIlil = 4.0F;
         }

         iIIlIllIlIlIll.Iiilliiliiil(lllIlilIIl);
         iIIlIllIlIlIll.IiIiliIiiiIi(illIlilIIl);
      }
   }

   private static void IiIIlliIIl(llIllIliilIllIli fromX, float fromY, float e) {
      fromX.lIiiIiIlilli(false);
      if (fromX.iIlIlllllill()) {
         Iliilliiilii(fromX, 2, fromY, e);
      } else {
         fromX.iIlIlIllIi = true;
         fromX.lIlIlIllIi = true;
         Iliilliiilii(fromX, 1, fromY, e);
      }
   }

   private static void iIIIlIlIIl() {
      llIllIliilIllIli var0 = iIlllilIIl;
      iIlllilIIl = null;
      lIlllilIIl = null;
      if (var0 != null) {
         Iliilliiilii(var0, illllilIIl ? 2 : 1, iilllilIIl, IIillilIIl);
      }
   }

   private static boolean illIlIilIl() {
      if (!iIiIlilIIl && lIlllilIIl != null && !IllllilIIl && iIlllilIIl == null) {
         float var0 = (float)iIIlIllIlIlIll.iiIIlIIlIl();
         float var1 = (float)iIIlIllIlIlIll.lIlIliIlIl();
         float var2 = var0 - IilllilIIl;
         float var3 = var1 - lilllilIIl;
         if (var2 * var2 + var3 * var3 >= 9.0F) {
            llIIlilIIl(lIlllilIIl, false, lIlllilIIl.iIIllIllIi, lIlllilIIl.IlIllIllIi);
         }

         return true;
      } else {
         return true;
      }
   }

   private static void liIlliiIll(float w, float x, float solid, float size, float strength, int y, float h, float r, boolean argb) {
      float var9 = (float)(y >>> 24 & 0xFF) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
      if (!(solid <= 0.0F) && !(size <= 0.0F) && !(var9 <= 0.003F)) {
         float var10 = IliiIilliiIi.Illlllllilll();
         float var11 = Math.max(2.0F, h + 2.0F);
         IliiIilliiIi.IIIilIIiiIIi(
            lIIlliIIll(),
            w - var11,
            x - var11,
            w + solid + var11,
            x + size + var11,
            w / var10,
            x / var10,
            solid / var10,
            size / var10,
            Math.min(strength, Math.min(solid, size) * 0.5F) / var10,
            (float)(y >> 16 & 0xFF) / 255.0F,
            (float)(y >> 8 & 0xFF) / 255.0F,
            (float)(y & 0xFF) / 255.0F,
            var9,
            h / var10,
            r,
            argb
         );
      }
   }

   private static void IIlllIlliIll() {
      long var18 = 1590709057011896601L;
      long var20 = -5163703898807552064L;
      long var22 = -3264297128182241691L;
      long var24 = 3882278120355951641L;
      long var26 = 2918007450990063625L;
      long var28 = -1075429140735455206L;
      long var30 = -2032535172888281465L;
      var18 ^= ((long)iIIlIllIlIlIll.IilliliilIIi() << 32 ^ var18) & -1L << 32;
      if ((int)(var18 >>> 32) != IiiIlilIIl) {
         var18 ^= ((long)(IiiIlilIIl >= 0 && (int)(var18 >>> 32) - IiiIlilIIl <= 3 ? 0 : 1) ^ var18) & -1L >>> 32;
         IiiIlilIIl = (int)(var18 >>> 32);
         liiIlilIIl = (float)llIilillilIilill.liiiIIllIl();
         iiiIlilIIl = iiiIlilIIl + liiIlilIIl;
         if (iiiIlilIIl > 3600.0F) {
            iiiIlilIIl -= 3600.0F;
         }

         class_310 var2 = class_310.method_1551();
         IIIllilIIl = (float)var2.method_22683().method_4486();
         lIIllilIIl = (float)var2.method_22683().method_4502();
         iIIllilIIl = (float)iIIlIllIlIlIll.iiIIlIIlIl();
         IlIllilIIl = (float)iIIlIllIlIlIll.lIlIliIlIl();
         class_746 var3 = var2.field_1724;
         llIllilIIl = var3 == null ? 1.0F : class_3532.method_15363(var3.method_6032() / Math.max(1.0F, var3.method_6063()), 0.0F, 1.0F);
         if ((int)var18 != 0) {
            lIlllilIIl = null;
            iIlllilIIl = null;
            liillilIIl = false;
            IIlililIIl = 0.0F;
            lIlililIIl = 0.0F;
            iIlililIIl = 0.0F;
            IllililIIl = 0.0F;
            lllililIIl = 1.0F;
            liIilliiiIilli[] var4 = IllIlilIIl;
            var20 ^= ((long)var4.length << 32 ^ var20) & -1L << 32;

            for (var20 ^= (0L ^ var20) & -1L >>> 32; (int)var20 < (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
               liIilliiiIilli var7 = var4[(int)var20];
               var7.IlIlliIIIl = false;
            }
         }

         if (iIlllilIIl != null) {
            var22 ^= ((long)(illllilIIl ? iIIlIllIlIlIll.Iilililiiili(illIlilIIl) : iIIlIllIlIlIll.Illillliilli(lllIlilIIl)) << 32 ^ var22) & -1L << 32;
            if ((int)(var22 >>> 32) == 0 || lillliiliillliil.liIlliiIll()) {
               iIIIlIlIIl();
            }
         }

         if (lIlllilIIl != null && (IllllilIIl ? !iIIlIllIlIlIll.Iilililiiili(illIlilIIl) : !iIIlIllIlIlIll.Illillliilli(lllIlilIIl))) {
            lIlllilIIl = null;
         }

         lIiiIiIlilli();
         var22 ^= (0L ^ var22) & -1L << 32;
         var20 ^= (0L ^ var20) & -1L << 32;
         llIllIliilIllIli[] var6 = iIlIlilIIl;
         var22 ^= ((long)var6.length ^ var22) & -1L >>> 32;
         var24 ^= (0L ^ var24) & -1L << 32;

         while ((int)(var24 >>> 32) < (int)var22) {
            llIllIliilIllIli var9 = var6[(int)(var24 >>> 32)];
            var9.IliIlllilIi();
            var9.iiIIlIllIi = var9.iIlIlllllill();
            var9.IIlIlIllIi = var9.IilliliilIIi();
            if ((int)var18 != 0) {
               var9.lllIlIllIi = var9.IIlIlIllIi ? 1.0F : 0.0F;
               var9.IliIlIllIi = 0.0F;
               float var10001;
               if (var9.iiIIlIllIi) {
                  int var10003 = (int)(var20 >>> 32);
                  var20 += 4294967296L;
                  var10001 = 0.12F + 0.05F * (float)var10003;
               } else {
                  var10001 = 0.0F;
               }

               var9.lIIllIllIi = var10001;
               var9.lIlIlIllIi = false;
               var9.iIlIlIllIi = false;
               var9.IIiIlIllIi = 0.0F;
               var9.iiiIlIllIi = 0.0F;
               var9.lIiIlIllIi = 0.0F;
               var9.IIIllIllIi = 0.0F;
               var9.lilIlIllIi = 0.0F;
               var9.iilIlIllIi = 0.0F;
               var9.iliIlIllIi = -1.0F;
            }

            var9.lllIlIllIi = IIIllIIliIIl(var9.lllIlIllIi, var9.IIlIlIllIi ? 1.0F : 0.0F, 10.0F);
            if (var9.lIIllIllIi > 0.0F && var9.iiIIlIllIi && iIIlIllIlIlIll.IllIllllIl() && iIIlIllIlIlIll.iIlIlllllill() > 0.9F) {
               var9.lIIllIllIi = var9.lIIllIllIi - liiIlilIIl;
            }

            var9.IliIlIllIi = IIIllIIliIIl(var9.IliIlIllIi, var9.iiIIlIllIi && var9.lIIllIllIi <= 0.0F ? 1.0F : 0.0F, 12.0F);
            if (var9.IIlIlIllIi) {
               var22 ^= (4294967296L ^ var22) & -1L << 32;
            }

            var24 ^= ((long)(iIlllilIIl == var9 && !illllilIIl ? 1 : 0) ^ var24) & -1L >>> 32;
            if (var9.lIlIlIllIi && (int)var24 == 0 && !IIiilIiiiIii(var9, 1) && (var9.IIlIlIllIi || var9.lllIlIllIi < 0.02F)) {
               var9.lIlIlIllIi = false;
            }

            var26 ^= ((long)(iIlllilIIl == var9 && illllilIIl ? 1 : 0) << 32 ^ var26) & -1L << 32;
            if (var9.iIlIlIllIi && (int)(var26 >>> 32) == 0 && !IIiilIiiiIii(var9, 2) && (var9.iiIIlIllIi || var9.IliIlIllIi < 0.02F)) {
               var9.iIlIlIllIi = false;
            }

            var9.IIiIlIllIi = IIIllIIliIIl(var9.IIiIlIllIi, var9.lIlIlIllIi ? 1.0F : 0.0F, 20.0F);
            var9.iiiIlIllIi = IIIllIIliIIl(var9.iiiIlIllIi, var9.iIlIlIllIi ? 1.0F : 0.0F, 20.0F);
            if (var9.lIiIlIllIi > 0.0F) {
               var9.lIiIlIllIi = Math.max(0.0F, var9.lIiIlIllIi - liiIlilIIl / 0.28F);
            }

            if (var9.IIIllIllIi > 0.0F) {
               var9.IIIllIllIi = Math.max(0.0F, var9.IIIllIllIi - liiIlilIIl / 0.28F);
            }

            var24 += 4294967296L;
         }

         liIllilIIl = (int)var18 != 0 ? ((int)(var22 >>> 32) != 0 ? 0.0F : 1.0F) : IIIllIIliIIl(liIllilIIl, (int)(var22 >>> 32) != 0 ? 0.0F : 1.0F, 9.0F);
         iiIllilIIl = IIIllIIliIIl(iiIllilIIl, iIlllilIIl != null && !illllilIIl ? 1.0F : 0.0F, 12.0F);
         float var32 = 59.0F;
         llIllIliilIllIli[] var33 = iIlIlilIIl;
         var24 ^= ((long)var33.length << 32 ^ var24) & -1L << 32;

         for (var26 ^= (0L ^ var26) & -1L >>> 32; (int)var26 < (int)(var24 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
            llIllIliilIllIli var10 = var33[(int)var26];
            float var11 = IlIlllIlilIl(var10.lllIlIllIi);
            var10.illIlIllIi = var32;
            var10.IilIlIllIi = var10.IIIilIIiiIIi() * var11;
            var32 += (var10.IIIilIIiiIIi() + 4.0F) * var11;
         }

         IiIllilIIl = var32;
         ilIllilIIl = var32 - 24.0F + 52.0F * IlIlllIlilIl(liIllilIIl) + 3.0F;
         Illlllllilll();
         float var34 = 31.0F;
         float var8 = 98.0F;
         llIllIliilIllIli[] var35 = iIlIlilIIl;
         var24 ^= ((long)var35.length ^ var24) & -1L >>> 32;

         for (var26 ^= (0L ^ var26) & -1L << 32; (int)(var26 >>> 32) < (int)var24; var26 += 4294967296L) {
            llIllIliilIllIli var12 = var35[(int)(var26 >>> 32)];
            if (iIIlIllIlIlIll.illilIilil(lllIlilIIl, var34 + var8 * 0.5F, var12.illIlIllIi + Math.max(var12.IilIlIllIi, 2.0F) * 0.5F, lilIlilIIl)) {
               var12.iIIllIllIi = lilIlilIIl[0];
               var12.IlIllIllIi = lilIlilIIl[1];
            } else if ((int)var18 != 0) {
               var12.iIIllIllIi = lllIlilIIl.IIIliIlillIIliIlil;
               var12.IlIllIllIi = lllIlilIIl.iIIliIlilIlIliIlil;
            }
         }

         ilillilIIl = iIIlIllIlIlIll.IllIllllIl();
         if (ilillilIIl) {
            float var36 = iIIlIllIlIlIll.IIiIllIiIl() - iIIlIllIlIlIll.illIlIilIl();
            float var38 = iIIlIllIlIlIll.iIiIlIliIl() - iIIlIllIlIlIll.lilIliilIl();
            iiillilIIl = iIIlIllIlIlIll.illIlIilIl() - var36 * 0.08F;
            lIIililIIl = iIIlIllIlIlIll.IIiIllIiIl() + var36 * 0.08F;
            IIIililIIl = iIIlIllIlIlIll.lilIliilIl() - var38 * 0.11F;
            iIIililIIl = iIIlIllIlIlIll.iIiIlIliIl() + var38 * 0.02F;
            IiillilIIl = true;
         }

         float var37 = 0.0F;
         float var39 = 0.0F;
         llIllIliilIllIli[] var40 = iIlIlilIIl;
         var28 ^= ((long)var40.length << 32 ^ var28) & -1L << 32;

         for (var28 ^= (0L ^ var28) & -1L >>> 32; (int)var28 < (int)(var28 >>> 32); var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
            llIllIliilIllIli var14 = var40[(int)var28];
            if (!(var14.IliIlIllIi <= 0.004F) || var14.iiIIlIllIi) {
               float var15 = var14.IlIillIiilIi();
               var14.iliIlIllIi = var14.iliIlIllIi < 0.0F ? var15 : IIIllIIliIIl(var14.iliIlIllIi, var15, 16.0F);
               var14.lliIlIllIi = var37;
               var37 += 17.0F * IlIlllIlilIl(var14.IliIlIllIi);
               if (var14.iliIlIllIi > var39) {
                  var39 = var14.iliIlIllIi;
               }
            }
         }

         liIililIIl = var37;
         ilIililIIl = var39;
         if (ilillilIIl) {
            float var41 = IIIililIIl + 4.0F;
            float var43 = lIIIlilIIl.IliiIIllIi instanceof iliIliIlIiiIliIl var13 ? var13.IlIllllIll(Float.NaN) : Float.NaN;
            if (!Float.isNaN(var43)) {
               var41 = Math.max(var41, var43 + 8.0F);
            }

            float var44 = iiillilIIl - 3.0F - IlIillIiilIi(2) - 6.0F;
            float var46 = Math.max(6.0F, lIIllilIIl - liIililIIl - 6.0F);
            float var49 = Math.max(var44, var39 + 6.0F);
            float var16 = class_3532.method_15363(var41, 6.0F, var46);
            iiIililIIl = var44 < var39 + 6.0F || !Float.isNaN(var43) && var43 + 8.0F > var46;
            if (!liillilIIl) {
               liillilIIl = true;
               IlIililIIl = var49;
               llIililIIl = var16;
            } else {
               IlIililIIl = IIIllIIliIIl(IlIililIIl, var49, 14.0F);
               llIililIIl = IIIllIIliIIl(llIililIIl, var16, 14.0F);
            }
         }

         IiIililIIl = IIIllIIliIIl(IiIililIIl, ilillilIIl && liillilIIl ? 1.0F : 0.0F, 10.0F);
         var40 = iIlIlilIIl;
         var28 ^= ((long)var40.length << 32 ^ var28) & -1L << 32;

         for (var28 ^= (0L ^ var28) & -1L >>> 32; (int)var28 < (int)(var28 >>> 32); var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
            llIllIliilIllIli var47 = var40[(int)var28];
            var47.llIllIllIi = IlIililIIl - Math.max(0.0F, var47.iliIlIllIi);
            var47.ilIllIllIi = llIililIIl + var47.lliIlIllIi;
         }

         var26 ^= ((long)(iIlllilIIl != null && iIlllilIIl.IIlilIliiIli() != null && ilillilIIl ? 1 : 0) << 32 ^ var26) & -1L << 32;
         var28 ^= ((long)((int)(var26 >>> 32) != 0 && iIlllilIIl.IIlllIlliIll() ? 1 : 0) << 32 ^ var28) & -1L << 32;
         iliililIIl = (int)(var26 >>> 32) != 0 ? IIillIiliIil(iIIllilIIl, IlIllilIIl, illllilIIl) : -1;
         if (iliililIIl >= 0) {
            IiiililIIl = iliililIIl;
         }

         IliililIIl = IIIllIIliIIl(IliililIIl, (int)(var26 >>> 32) != 0 ? 1.0F : 0.0F, 12.0F);
         lliililIIl = IIIllIIliIIl(lliililIIl, (int)(var28 >>> 32) != 0 && iliililIIl >= 0 ? 1.0F : 0.0F, 16.0F);

         for (var28 ^= (0L ^ var28) & -1L >>> 32; (int)var28 < 4; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
            IIiililIIl[(int)var28] = IIIllIIliIIl(IIiililIIl[(int)var28], iliililIIl == (int)var28 ? 1.0F : 0.0F, 18.0F);
         }

         var28 ^= (
               (long)(iIlllilIIl == null || !ilillilIIl || ((int)(var26 >>> 32) != 0 ? iliililIIl < 0 : !Iilllilliill(iIIllilIIl, IlIllilIIl)) ? 0 : 1) ^ var28
            )
            & -1L >>> 32;
         IIlililIIl = IIIllIIliIIl(IIlililIIl, iIlllilIIl != null && ilillilIIl && (int)(var26 >>> 32) == 0 ? 1.0F : 0.0F, 12.0F);
         lIlililIIl = IIIllIIliIIl(lIlililIIl, (int)var28 != 0 && (int)(var26 >>> 32) == 0 ? 1.0F : 0.0F, 16.0F);
         iIlililIIl = IIIllIIliIIl(iIlililIIl, iIlllilIIl != null && !illllilIIl && (int)var28 != 0 && (int)(var28 >>> 32) == 0 ? 1.0F : 0.0F, 16.0F);
         IllililIIl = IIIllIIliIIl(IllililIIl, iIlllilIIl != null && illllilIIl && ilillilIIl && (int)var28 == 0 ? 1.0F : 0.0F, 16.0F);
         llillilIIl = IIIllIIliIIl(llillilIIl, iIlllilIIl != null && illllilIIl && ilillilIIl && (int)var28 == 0 ? 1.0F : 0.0F, 16.0F);
         if (lllililIIl < 1.0F) {
            lllililIIl = Math.min(1.0F, lllililIIl + liiIlilIIl * 1000.0F / 460.0F);
         }

         if (iIlllilIIl != null) {
            Iilililiiili(iIIllilIIl, IlIllilIIl);
            IlillilIIl = IIIllIIliIIl(IlillilIIl, 1.0F, 22.0F);
         }

         liIilliiiIilli[] var48 = IllIlilIIl;
         var30 ^= ((long)var48.length << 32 ^ var30) & -1L << 32;

         for (long var71 = var30 ^ (0L ^ var30) & -1L >>> 32; (int)var71 < (int)(var71 >>> 32); var71 ^= (var71 ^ var71 + (long)1) & -1L >>> 32) {
            liIilliiiIilli var17 = var48[(int)var71];
            if (var17.IlIlliIIIl) {
               IIIIllIIIl(var17);
            }
         }
      }
   }

   private static void llIIlilIIl(llIllIliilIllIli e, boolean fromX, float chip, float fromY) {
      iIlllilIIl = e;
      illllilIIl = fromX;
      iilllilIIl = chip;
      IIillilIIl = fromY;
      lIillilIIl = 0.0F;
      iIillilIIl = 0.0F;
      IlillilIIl = 0.0F;
      if (fromX) {
         e.iIlIlIllIi = true;
      } else {
         e.lIlIlIllIi = true;
      }
   }

   private static void lIiiIiIlilli() {
      long var5 = 4472310008009086953L;
      IIliiIlllIliiIll var0 = llilliilililliil.IIiilIiiiIii();
      if (var0 != IliIlilIIl) {
         IliIlilIIl = var0;
         lliIlilIIl = llilliilililliil.IllIllllIl(0.0F, 0.0F, 1.0F);
         illililIIl = -1.0F;
         IilililIIl = -1.0F;
         lilililIIl = -1.0F;
         iilililIIl = -1.0F;
         Arrays.fill(lIiililIIl, -1.0F);
         Arrays.fill(iIiililIIl, -1.0F);
         llIllIliilIllIli[] var1 = iIlIlilIIl;
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            llIllIliilIllIli var4 = var1[(int)var8];
            var4.liIIlIllIi = -1.0F;
            var4.IIIIlIllIi = -1.0F;
            var4.iliIlIllIi = -1.0F;
            if (var4.ilIIlIllIi != null) {
               Arrays.fill(var4.ilIIlIllIi, -1.0F);
            }
         }
      }
   }

   private static llIllIliilIllIli iiIIlIIlIl(float mx, float my) {
      long var8 = 2641824981367792496L;
      float var2 = 31.0F;
      float var3 = 98.0F;
      if (!(mx < var2) && !(mx > var2 + var3)) {
         llIllIliilIllIli[] var4 = iIlIlilIIl;
         var8 ^= ((long)var4.length << 32 ^ var8) & -1L << 32;

         for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            llIllIliilIllIli var7 = var4[(int)var11];
            if (var7.IIlIlIllIi && !(var7.lllIlIllIi < 0.6F) && my >= var7.illIlIllIi && my <= var7.illIlIllIi + var7.IilIlIllIi) {
               return var7;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public static boolean iiiilIIIIi(String out, float[] name) {
      llIllIliilIllIli var2 = Iiiilliiil(out);
      if (var2 != null && var2.IIlIlIllIi && !(var2.lllIlIllIi < 0.6F)) {
         name[0] = var2.iIIllIllIi;
         name[1] = var2.IlIllIllIi - (var2.IIiiIIllIi ? 9.5F * IIlllilIIl : 0.0F);
         return true;
      } else {
         return false;
      }
   }

   private static float IIIllIIliIIl(float current, float target, float rate) {
      float var3 = (float)IiiIIIIlliiIIIIl.iIlIlllllill((double)current, (double)target, (double)rate, (double)liiIlilIIl);
      return Math.abs(var3 - target) < 0.0015F ? target : var3;
   }

   private static float IIIilIIiiIIi(int z) {
      if (lIiililIIl[z] < 0.0F) {
         lIiililIIl[z] = llilliilililliil.llIIlilIIl(IiilIilIIl[z]);
      }

      return lIiililIIl[z];
   }

   private static void lIliliIlil() {
      long var9 = -5565018137947721309L;
      float var0 = iiillilIIl;
      float var1 = IIIililIIl;
      float var2 = lIIililIIl - iiillilIIl;
      float var3 = iIIililIIl - IIIililIIl;
      float var4 = 10.0F;
      var9 ^= ((long)IlIIilIlllIIilIl.lliiIlliIl << 32 ^ var9) & -1L << 32;
      if (IIlililIIl > 0.01F) {
         float var6 = 0.5F + 0.5F * class_3532.method_15374((double)(iiiIlilIIl * 3.6F));
         liIlliiIll(
            var0,
            var1,
            var2,
            var3,
            var4,
            llilliilililliil.IIIIllIIIl((int)(var9 >>> 32), IIlililIIl * (0.18F + 0.26F * lIlililIIl + 0.06F * var6)),
            9.0F + 5.0F * lIlililIIl,
            0.85F,
            false
         );
         IlIllllIll(var0, var1, var2, var3, var4, llilliilililliil.IIIIllIIIl((int)(var9 >>> 32), IIlililIIl * 0.07F * lIlililIIl));
         ilIllIiIll(
            var0,
            var1,
            var2,
            var3,
            var4,
            1.0F,
            llilliilililliil.IIIIllIIIl(IilIIIIililIIIIi.Illlllllilll((int)(var9 >>> 32), -1, 0.22), IIlililIIl * (0.4F + 0.5F * lIlililIIl))
         );
      }

      if (lllililIIl < 1.0F) {
         float var11 = llilliilililliil.liiiIIllIl(lllililIIl);
         float var7 = 14.0F * var11;
         float var8 = 1.0F - lllililIIl;
         ilIllIiIll(
            var0 - var7, var1 - var7, var2 + var7 * 2.0F, var3 + var7 * 2.0F, var4 + var7, 1.5F, llilliilililliil.IIIIllIIIl((int)(var9 >>> 32), var8 * 0.78F)
         );
         liIlliiIll(var0, var1, var2, var3, var4, llilliilililliil.IIIIllIIIl((int)(var9 >>> 32), var8 * var8 * 0.42F), 12.0F, 0.85F, false);
         IlIllllIll(var0, var1, var2, var3, var4, llilliilililliil.IIIIllIIIl((int)(var9 >>> 32), var8 * var8 * 0.13F));
      }
   }

   public static boolean IlIIillIIi(float[] out) {
      if (!iIIlIllIlIlIll.IllIllllIl()) {
         return false;
      } else {
         out[0] = (iIIlIllIlIlIll.illIlIilIl() + iIIlIllIlIlIll.IIiIllIiIl()) * 0.5F;
         out[1] = (iIIlIllIlIlIll.lilIliilIl() + iIIlIllIlIlIll.iIiIlIliIl()) * 0.5F;
         return true;
      }
   }

   private static void IiIiliIiiiIi(int z, float[] r) {
      float var2 = lIIililIIl - iiillilIIl;
      float var3 = iIIililIIl - IIIililIIl;
      switch (z) {
         case 0:
            r[0] = iiillilIIl;
            r[1] = Math.max(IIIililIIl - 3.0F - 22.0F, 4.0F);
            r[2] = var2;
            r[3] = 22.0F;
            break;
         case 1:
            r[0] = iiillilIIl;
            r[1] = Math.min(iIIililIIl + 3.0F, lIIllilIIl - 22.0F - 4.0F);
            r[2] = var2;
            r[3] = 22.0F;
            break;
         case 2:
            float var4 = IlIillIiilIi(2);
            r[0] = iiillilIIl - 3.0F - var4;
            r[1] = IIIililIIl;
            r[2] = var4;
            r[3] = var3;
            break;
         default:
            r[0] = lIIililIIl + 3.0F;
            r[1] = IIIililIIl;
            r[2] = IlIillIiilIi(3);
            r[3] = var3;
      }
   }

   private static void llIililIil(int hot, float y, float x, float kind) {
      long var11 = 2874574141512742520L;
      long var13 = -7719909139041343457L;
      class_310 var4 = class_310.method_1551();
      class_746 var5 = var4.field_1724;
      var11 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.18 * (double)kind) << 32 ^ var11) & -1L << 32;
      switch (hot) {
         case 0:
            IIllllIlll(y, x + 2.0F, 20.0F, 10.0F, 3.0F, -267777266, IilIIIIililIIIIi.IIlllIlliIll(0.42 + 0.3 * (double)kind));
            IlIllllIll(y + 3.0F, x + 4.5F, 8.0F, 1.5F, 0.75F, -638389001);
            IlIllllIll(y + 3.0F, x + 7.5F, 14.0F, 1.5F, 0.75F, -1946157056);
            IlIllllIll(y + 3.0F, x + 7.5F, 14.0F * llIllilIIl, 1.5F, 0.75F, lIilliIill());
            break;
         case 1:
            IlIllllIll(y, x + 5.0F, 20.0F, 4.0F, 2.0F, Integer.MIN_VALUE);
            IlIllllIll(y, x + 5.0F, Math.max(4.0F, 20.0F * llIllilIIl), 4.0F, 2.0F, lIilliIill());
            break;
         case 2:
            for (long var22 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var22 < 4; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
               class_1304 var17 = (int)var22 == 0
                  ? class_1304.field_6169
                  : ((int)var22 == 1 ? class_1304.field_6174 : ((int)var22 == 2 ? class_1304.field_6172 : class_1304.field_6166));
               var13 ^= ((long)(var5 != null && !var5.method_6118(var17).method_7960() ? 1 : 0) << 32 ^ var13) & -1L << 32;
               float var10 = y + (float)((int)var22) * 5.3F;
               if ((int)(var13 >>> 32) != 0) {
                  IlIllllIll(var10, x + 5.0F, 4.0F, 4.0F, 1.0F, llilliilililliil.IIIIllIIIl((int)(var22 >>> 32), 0.92F));
               } else {
                  ilIllIiIll(var10, x + 5.0F, 4.0F, 4.0F, 1.0F, 0.75F, 1308622847);
               }
            }
            break;
         case 3:
            var11 ^= ((long)(var5 != null && !var5.method_6047().method_7960() ? 1 : 0) ^ var11) & -1L >>> 32;
            var13 ^= ((long)(var5 != null && !var5.method_6079().method_7960() ? 1 : 0) ^ var13) & -1L >>> 32;
            if ((int)var11 != 0) {
               IlIllllIll(y + 3.0F, x + 4.0F, 6.0F, 6.0F, 1.5F, llilliilililliil.IIIIllIIIl((int)(var11 >>> 32), 0.92F));
            } else {
               ilIllIiIll(y + 3.0F, x + 4.0F, 6.0F, 6.0F, 1.5F, 0.75F, 1308622847);
            }

            if ((int)var13 != 0) {
               IlIllllIll(y + 11.0F, x + 4.0F, 6.0F, 6.0F, 1.5F, llilliilililliil.IIIIllIIIl((int)(var11 >>> 32), 0.92F));
            } else {
               ilIllIiIll(y + 11.0F, x + 4.0F, 6.0F, 6.0F, 1.5F, 0.75F, 1308622847);
            }
         case 4:
         default:
            break;
         case 5:
            float var15 = iiiIlilIIl * 5.0F % 6.0F;

            for (long var23 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var23 < 5; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
               float var9 = llilliilililliil.IliIlllilIi(1.0F - Math.abs(var15 - (float)((int)var23)) * 0.8F);
               IlIllllIll(
                  y + 1.0F + (float)((int)var23) * 3.6F,
                  x + 11.0F - (float)((int)var23) * 2.1F,
                  1.6F,
                  1.6F,
                  0.8F,
                  llilliilililliil.IIIIllIIIl((int)(var11 >>> 32), 0.34F + 0.66F * var9)
               );
            }

            IlIllllIll(y + 16.2F, x + 0.4F, 3.2F, 3.2F, 1.6F, (int)(var11 >>> 32));
            break;
         case 6:
            float var7 = 0.5F + 0.5F * class_3532.method_15374((double)(iiiIlilIIl * 3.2F));
            float var16 = 10.5F + 1.5F * var7;
            ilIllIiIll(
               y + 10.0F - var16 * 0.5F,
               x + 7.0F - var16 * 0.5F,
               var16,
               var16,
               var16 * 0.5F,
               1.2F,
               llilliilililliil.IIIIllIIIl((int)(var11 >>> 32), 0.7F + 0.3F * var7)
            );
            IlIllllIll(y + 8.5F, x + 5.5F, 3.0F, 3.0F, 1.5F, (int)(var11 >>> 32));
            break;
         case 7:
            var11 ^= ((long)(0xFF000000 | Color.HSBtoRGB(llIllilIIl * 0.333F, 1.0F, 1.0F) & 16777215) ^ var11) & -1L >>> 32;
            IlIllllIll(y + 6.0F, x + 0.5F, 8.0F, 13.0F, 1.5F, llilliilililliil.IIIIllIIIl((int)var11, 0.2F));
            ilIllIiIll(y + 6.0F, x + 0.5F, 8.0F, 13.0F, 1.5F, 1.2F, (int)var11);
            break;
         case 8:
            for (long var19 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var19 < 3; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
               float var8 = y + 1.0F + (float)((int)var19) * 6.5F;
               var13 ^= ((long)((int)var19 == 0 ? -2077877 : ((int)var19 == 1 ? -11688193 : -868018)) << 32 ^ var13) & -1L << 32;
               IlIllllIll(var8, x + 3.0F, 5.0F, 5.0F, 2.5F, llilliilililliil.IIIIllIIIl((int)(var13 >>> 32), 0.9F));
               IlIllllIll(var8, x + 10.0F, 5.0F, 1.5F, 0.75F, llilliilililliil.IIIIllIIIl((int)(var19 >>> 32), 0.55F));
            }
      }
   }

   private static boolean Ililllililil(float y, float x) {
      return lllIlilIIl.illliIlilIilliIlil && iIIlIllIlIlIll.lililiilil(lllIlilIIl, (double)y, (double)x, lIIIiilIIl)
         ? lIIIiilIIl[0] >= lllIlilIIl.iilIiIlilIIiIiIlil
            && lIIIiilIIl[0] <= lllIlilIIl.iilIiIlilIIiIiIlil + lllIlilIIl.IliIiIlillliIiIlil
            && lIIIiilIIl[1] >= lllIlilIIl.lIiIiIliliIiIiIlil
            && lIIIiilIIl[1] <= lllIlilIIl.lIiIiIliliIiIiIlil + lllIlilIIl.iliIiIlilIiiIiIlil
         : false;
   }

   private static void IlIllllIll(float x, float r, float y, float argb, float w, int h) {
      float var6 = (float)(h >>> 24 & 0xFF) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
      if (!(y <= 0.0F) && !(argb <= 0.0F) && !(var6 <= 0.003F)) {
         float var7 = IliiIilliiIi.Illlllllilll();
         IliiIilliiIi.Iilllilliill(
            lIIlliIIll(),
            x - 1.0F,
            r - 1.0F,
            x + y + 1.0F,
            r + argb + 1.0F,
            x / var7,
            r / var7,
            y / var7,
            argb / var7,
            Math.min(w, Math.min(y, argb) * 0.5F) / var7,
            (float)(h >> 16 & 0xFF) / 255.0F,
            (float)(h >> 8 & 0xFF) / 255.0F,
            (float)(h & 0xFF) / 255.0F,
            var6
         );
      }
   }

   private static llIllIliilIllIli Iiiilliiil(String name) {
      long var6 = 6552604186430548581L;
      String var1 = IilliliilIIi(name);
      llIllIliilIllIli[] var2 = iIlIlilIIl;
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         llIllIliilIllIli var5 = var2[(int)var9];
         if (var5.iIliIIllIi.equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public static boolean iIlIiIllIi(String zone, String name) {
      long var4 = 1326523617859553514L;
      llIllIliilIllIli var2 = Iiiilliiil(zone);
      if (var2 == null) {
         return false;
      } else {
         var2.IliIlllilIi();
         if (!var2.IIlllIlliIll()) {
            return false;
         } else {
            for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < IiilIilIIl.length; var6 += 4294967296L) {
               if (IiilIilIIl[(int)(var6 >>> 32)].equalsIgnoreCase(name)) {
                  var2.Iilllilliill((int)(var6 >>> 32));
                  var2.lIiiIiIlilli(true);
                  return var2.iIlIlllllill();
               }
            }

            return false;
         }
      }
   }

   private static void iIiilIliil(class_332 fl, liIilliiiIilli ctx) {
      float var2 = llilliilililliil.IliIlllilIi(ctx.iiIlliIIIl);
      float var3;
      float var4;
      if (ctx.iIIlliIIIl == 0) {
         var3 = 1.04F - 0.5F * llilliilililliil.iIlIlllllill(var2);
         var4 = 1.0F - llilliilililliil.IliIlllilIi((var2 - 0.5F) / 0.5F);
      } else {
         var3 = 1.04F - 0.14F * var2;
         var4 = 1.0F - llilliilililliil.IliIlllilIi((var2 - 0.78F) / 0.22F);
      }

      lliililiil(fl, ctx.lIIlliIIIl, ctx.IiIlliIIIl, ctx.liIlliIIIl, var3, var4, 0.0F);
   }

   private static float iliIiiliiiii(float boxY, float boxH, float scale) {
      return boxY + boxH * 0.5F + lliIlilIIl * scale;
   }

   private static void lllllillll(class_2960 y, float argb, float x, float size, int id) {
      iiIlilIlIIllilIl.IliIlllilIi(argb, x, size, size, y, iiiIlIIIll(id), IIIiiIillIIiiIil.liiiIIllIl());
   }

   public static String lllIiillIi() {
      long var5 = -3092252185621136793L;
      StringBuilder var0 = new StringBuilder();
      llIllIliilIllIli[] var1 = iIlIlilIIl;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for (long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         llIllIliilIllIli var4 = var1[(int)var8];
         var4.IliIlllilIi();
         var0.append(var4.lIliIIllIi)
            .append('=')
            .append(
               var4.iIlIlllllill()
                  ? IilIililIi<"IilIililIi","qeTnkgtvOsDwoSRpGOkuW+KrFprDJNMgBpy3PWEn">()
                  : (
                     var4.IilliliilIIi()
                        ? IilIililIi<"IilIililIi","ReqsMLwD996WV1GfwDWwtUvdBkXnjXywuzXf5LfFTPiVWQ==">()
                        : IilIililIi<"IilIililIi","qwRT+XQd9dpIozfpR27TyfcfSQ9rZMsTYPOBKnMVDM3ROg==">()
                  )
            );
         if (var4.IIlllIlliIll()) {
            var0.append('@').append(var4.IiiiIIllIi.Iilllilliill());
         }

         var0.append(' ');
      }

      return var0.toString().trim();
   }

   private static void iIIilIlIil(int id, float x, float y, int c) {
      switch (id) {
         case 0:
            liIlliiIll(x + 4.0F, y + 1.5F, 4.0F, 8.0F, 2.0F, llilliilililliil.IIIIllIIIl(c, 0.55F), 3.5F, 0.9F, false);
            IlIllllIll(x + 4.0F, y + 1.5F, 4.0F, 8.0F, 1.5F, c);
            break;
         case 1:
            float var4 = x + 1.5F;
            float var5 = 9.0F;
            float var6 = 11.0F;
            IlIllllIll(var4, y, 3.0F, 1.0F, 0.5F, c);
            IlIllllIll(var4, y, 1.0F, 3.0F, 0.5F, c);
            IlIllllIll(var4 + var5 - 3.0F, y, 3.0F, 1.0F, 0.5F, c);
            IlIllllIll(var4 + var5 - 1.0F, y, 1.0F, 3.0F, 0.5F, c);
            IlIllllIll(var4, y + var6 - 1.0F, 3.0F, 1.0F, 0.5F, c);
            IlIllllIll(var4, y + var6 - 3.0F, 1.0F, 3.0F, 0.5F, c);
            IlIllllIll(var4 + var5 - 3.0F, y + var6 - 1.0F, 3.0F, 1.0F, 0.5F, c);
            IlIllllIll(var4 + var5 - 1.0F, y + var6 - 3.0F, 1.0F, 3.0F, 0.5F, c);
            break;
         case 2:
         default:
            IlIllllIll(x + 2.0F, y + 0.5F, 8.0F, 10.0F, 1.5F, llilliilililliil.IIIIllIIIl(c, 0.36F));
            ilIllIiIll(x + 2.0F, y + 0.5F, 8.0F, 10.0F, 1.5F, 1.0F, c);
            break;
         case 3:
            ilIllIiIll(x + 1.0F, y + 0.5F, 7.0F, 10.0F, 1.0F, 1.0F, c);
            IlIllllIll(x + 9.6F, y + 0.5F, 1.4F, 10.0F, 0.7F, llilliilililliil.IIIIllIIIl(c, 0.45F));
            IlIllllIll(x + 9.6F, y + 0.5F + 10.0F * (1.0F - llIllilIIl), 1.4F, 10.0F * llIllilIIl, 0.7F, c);
            break;
         case 4:
            IlIllllIll(x + 4.8F, y, 2.4F, 2.4F, 1.2F, c);
            IlIllllIll(x + 5.5F, y + 2.6F, 1.0F, 4.6F, 0.5F, c);
            IlIllllIll(x + 2.5F, y + 3.8F, 7.0F, 1.0F, 0.5F, c);
            IlIllllIll(x + 4.0F, y + 6.8F, 4.0F, 1.0F, 0.5F, c);
            IlIllllIll(x + 4.0F, y + 6.8F, 1.0F, 4.2F, 0.5F, c);
            IlIllllIll(x + 7.0F, y + 6.8F, 1.0F, 4.2F, 0.5F, c);
      }
   }

   private llIlIiiilIlIii() {
   }

   private static void IiiIlliiIl(float x, float y) {
      long var7 = 5043773431974199649L;
      llIllIliilIllIli var2 = lIlllilIIl;
      lIlllilIIl = null;
      if (iIlllilIIl != null && illllilIIl) {
         llIllIliilIllIli var3 = iIlllilIIl;
         iIlllilIIl = null;
         var7 ^= ((long)(iIIlIllIlIlIll.IllIllllIl() && IiillilIIl ? 1 : 0) << 32 ^ var7) & -1L << 32;
         llIllIliilIllIli var5 = var3.IIlilIliiIli();
         var7 ^= ((long)(var5 != null && (int)(var7 >>> 32) != 0 ? IIillIiliIil(x, y, true) : -1) ^ var7) & -1L >>> 32;
         if ((int)var7 >= 0) {
            if (var3.IIlllIlliIll()) {
               var3.Iilllilliill((int)var7);
               var3.IIIllIllIi = 1.0F;
            }

            Iliilliiilii(var3, 2, iilllilIIl, IIillilIIl);
         } else if ((int)(var7 >>> 32) != 0 && (var5 != null || !Iilllilliill(x, y))) {
            IiIIlliIIl(var3, iilllilIIl, IIillilIIl);
         } else {
            Iliilliiilii(var3, 2, iilllilIIl, IIillilIIl);
         }
      } else if (var2 != null && IllllilIIl && IIiIllIiIl(x, y) == var2) {
         if (lllllilIIl) {
            if (x >= var2.llIllIllIi + var2.iliIlIllIi - 12.0F) {
               IiIIlliIIl(var2, var2.llIllIllIi + var2.iliIlIllIi * 0.5F, var2.ilIllIllIi + 7.0F);
            }
         } else if (var2.IIiiIIllIi && var2.iIIIlIllIi > 1) {
            var2.iliiIIllIi.Iiilliiliiil((var2.iliIiiliiiii() + 1) % var2.iIIIlIllIi);
            var2.IIIllIllIi = 1.0F;
         }
      }
   }

   private static int Ilillllill() {
      return IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.28);
   }

   private static String IilliliilIIi(String s) {
      return s.toLowerCase(Locale.ROOT)
         .replace(IilIililIi<"IilIililIi","4l6fvkrSIqxXAndwJGuuwfw5jGQZnND7DDCEOwU=">(), "")
         .replace(IilIililIi<"IilIililIi","HJCKKT5SUwRBXu2OFrszTP94PhPeV6KhkZxqNR0=">(), "");
   }

   private static void Iiiiliiiiiii(liIilliiiIilli fl) {
      fl.IlIlliIIIl = false;
      if (fl.iIIlliIIIl == 1) {
         fl.lIIlliIIIl.lIlIlIllIi = false;
         fl.lIIlliIIIl.lIiIlIllIi = 1.0F;
      } else if (fl.iIIlliIIIl == 2) {
         fl.lIIlliIIIl.iIlIlIllIi = false;
         fl.lIIlliIIIl.IIIllIllIi = 1.0F;
      }
   }

   private static void illilIilil(class_332 ctx) {
      long var26 = 4208546243769917081L;
      long var28 = -261884614960878828L;
      long var30 = -4619570338227100911L;
      float var1 = IlIlllIlilIl(IliililIIl);
      if (!(var1 <= 0.01F)) {
         var26 ^= ((long)IlIIilIlllIIilIl.lliiIlliIl << 32 ^ var26) & -1L << 32;
         float var3 = IliiIilliiIi.IilliliilIIi(var1);

         try {
            float var4 = iiillilIIl;
            float var5 = IIIililIIl;
            float var6 = lIIililIIl;
            float var7 = iIIililIIl;
            float var8 = Math.min(9.0F, Math.min(var6 - var4, var7 - var5) * 0.3F);
            var26 ^= ((long)llilliilililliil.IIIIllIIIl(-1, 0.62F) ^ var26) & -1L >>> 32;
            IlIllllIll(var4, var5, var8, 1.0F, 0.5F, (int)var26);
            IlIllllIll(var4, var5, 1.0F, var8, 0.5F, (int)var26);
            IlIllllIll(var6 - var8, var5, var8, 1.0F, 0.5F, (int)var26);
            IlIllllIll(var6 - 1.0F, var5, 1.0F, var8, 0.5F, (int)var26);
            IlIllllIll(var4, var7 - 1.0F, var8, 1.0F, 0.5F, (int)var26);
            IlIllllIll(var4, var7 - var8, 1.0F, var8, 0.5F, (int)var26);
            IlIllllIll(var6 - var8, var7 - 1.0F, var8, 1.0F, 0.5F, (int)var26);
            IlIllllIll(var6 - 1.0F, var7 - var8, 1.0F, var8, 0.5F, (int)var26);
            var28 ^= (0L ^ var28) & -1L << 32;

            while ((int)(var28 >>> 32) < 4) {
               float var11 = IIiililIIl[(int)(var28 >>> 32)];
               IiIiliIiiiIi((int)(var28 >>> 32), liiililIIl);
               float var12 = liiililIIl[0];
               float var13 = liiililIIl[1];
               float var14 = liiililIIl[2];
               float var15 = liiililIIl[3];
               if (var11 > 0.01F) {
                  liIlliiIll(var12, var13, var14, var15, 6.0F, llilliilililliil.IIIIllIIIl((int)(var26 >>> 32), 0.3F * var11), 8.0F, 0.8F, false);
                  IlIllllIll(var12, var13, var14, var15, 6.0F, llilliilililliil.IIIIllIIIl((int)(var26 >>> 32), 0.16F * var11));
               }

               ilIllIiIll(
                  var12,
                  var13,
                  var14,
                  var15,
                  6.0F,
                  1.0F,
                  IilIIIIililIIIIi.Illlllllilll(llilliilililliil.IIIIllIIIl(-1, 0.22F), llilliilililliil.IIIIllIIIl((int)(var26 >>> 32), 0.95F), (double)var11)
               );
               float var16 = IIIilIIiiIIi((int)(var28 >>> 32)) * 0.78F;
               float var17 = var16 + 12.0F;
               float var18 = 13.0F;
               float var19 = var12 + (var14 - var17) * 0.5F;
               float var20 = var13 + (var15 - var18) * 0.5F;
               if ((int)(var28 >>> 32) == 2 || (int)(var28 >>> 32) == 3) {
                  var20 = var13 + Math.min(var15 * 0.22F, Math.max(0.0F, var15 - var18));
               }

               float var21 = 1.0F + 0.08F * var11;
               var28 ^= ((long)llilliilililliil.IlIlllIlilIl(ctx, var19 + var17 * 0.5F, var20 + var18 * 0.5F, var21) ^ var28) & -1L >>> 32;

               try {
                  IIllllIlll(
                     var19,
                     var20,
                     var17,
                     var18,
                     var18 * 0.5F,
                     IilIIIIililIIIIi.Illlllllilll(-267381991, IilIIIIililIIIIi.Illlllllilll(-15723751, (int)(var26 >>> 32), 0.35), (double)var11),
                     IilIIIIililIIIIi.Illlllllilll(
                        llilliilililliil.IIIIllIIIl(-1, 0.2F), llilliilililliil.IIIIllIIIl((int)(var26 >>> 32), 0.95F), (double)var11
                     )
                  );
                  Iillllilll(
                     IiilIilIIl[(int)(var28 >>> 32)],
                     var19 + 6.0F,
                     iliIiiliiiii(var20, var18, 0.78F),
                     0.78F,
                     IilIIIIililIIIIi.Illlllllilll(-5854026, -1, (double)var11)
                  );
               } finally {
                  llilliilililliil.IiIlliIliiIl(ctx, (boolean)((int)var28));
               }

               var28 += 4294967296L;
            }

            float var10 = IlIlllIlilIl(lliililIIl);
            if (var10 > 0.01F) {
               var30 ^= ((long)IiiililIIl << 32 ^ var30) & -1L << 32;
               if (iIiililIIl[(int)(var30 >>> 32)] < 0.0F) {
                  iIiililIIl[(int)(var30 >>> 32)] = llilliilililliil.llIIlilIIl(liilIilIIl[(int)(var30 >>> 32)]);
               }

               float var44 = iIiililIIl[(int)(var30 >>> 32)] * 0.86F;
               float var45 = var44 + 16.0F;
               float var46 = 15.0F;
               float var47 = class_3532.method_15363(
                  (iiillilIIl + lIIililIIl) * 0.5F, var45 * 0.5F + 6.0F, Math.max(var45 * 0.5F + 6.0F, IIIllilIIl - var45 * 0.5F - 6.0F)
               );
               float var48 = IIlilIliiIli(var46, 8.0F, 1.0F);
               float var49 = IliiIilliiIi.IilliliilIIi(var10);
               var30 ^= (
                     (long)llilliilililliil.IlIlllIlilIl(ctx, var47, var48 + var46 * 0.5F, 0.84F + 0.16F * llilliilililliil.IilliliilIIi(var10, 1.7F)) ^ var30
                  )
                  & -1L >>> 32;

               try {
                  liIlliiIll(
                     var47 - var45 * 0.5F, var48 + 1.5F, var45, var46, var46 * 0.5F, llilliilililliil.IIIIllIIIl((int)(var26 >>> 32), 0.38F), 7.0F, 0.55F, true
                  );
                  IlIllllIll(var47 - var45 * 0.5F, var48, var45, var46, var46 * 0.5F, llilliilililliil.IIIIllIIIl((int)(var26 >>> 32), 0.94F));
                  Iillllilll(liilIilIIl[(int)(var30 >>> 32)], var47 - var44 * 0.5F, iliIiiliiiii(var48, var46, 0.86F), 0.86F, llilliilililliil.Iiiiliiiiiii());
               } finally {
                  llilliilililliil.IiIlliIliiIl(ctx, (boolean)((int)var30));
                  IliiIilliiIi.lIiiIiIlilli(var49);
               }
            }
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var3);
         }
      }
   }

   private static llIllIliilIllIli IIiIllIiIl(float y, float x) {
      long var6 = 7652664599852286038L;
      if (!iIiIlilIIl && !(IiIililIIl < 0.5F)) {
         llIllIliilIllIli[] var2 = iIlIlilIIl;
         var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

         for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            llIllIliilIllIli var5 = var2[(int)var9];
            if (var5.iiIIlIllIi
               && !(var5.IliIlIllIi < 0.5F)
               && !(var5.iliIlIllIi <= 0.0F)
               && y >= var5.llIllIllIi - 1.0F
               && y <= var5.llIllIllIi + var5.iliIlIllIi + 1.0F
               && x >= var5.ilIllIllIi - 1.0F
               && x <= var5.ilIllIllIi + 14.0F + 1.0F) {
               return var5;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static void IIiillIiil(class_332 show, String fillColor, float labelW, float textColor, int label, int ctx) {
      long var14 = -8126758419479589883L;
      if (!(textColor <= 0.01F)) {
         float var6 = labelW * 0.86F;
         float var7 = var6 + 16.0F;
         float var8 = 15.0F;
         float var9 = class_3532.method_15363(
            (iiillilIIl + lIIililIIl) * 0.5F, var7 * 0.5F + 6.0F, Math.max(var7 * 0.5F + 6.0F, IIIllilIIl - var7 * 0.5F - 6.0F)
         );
         float var10 = IIlilIliiIli(var8, 10.0F, IlIlllIlilIl(IliililIIl));
         float var11 = IliiIilliiIi.IilliliilIIi(textColor);
         var14 ^= (
               (long)llilliilililliil.IlIlllIlilIl(show, var9, var10 + var8 * 0.5F, 0.84F + 0.16F * llilliilililliil.IilliliilIIi(textColor, 1.7F)) << 32
                  ^ var14
            )
            & -1L << 32;

         try {
            liIlliiIll(var9 - var7 * 0.5F, var10 + 1.5F, var7, var8, var8 * 0.5F, llilliilililliil.IIIIllIIIl(label, 0.38F), 7.0F, 0.55F, true);
            IlIllllIll(var9 - var7 * 0.5F, var10, var7, var8, var8 * 0.5F, label);
            Iillllilll(fillColor, var9 - var6 * 0.5F, iliIiiliiiii(var10, var8, 0.86F), 0.86F, ctx);
         } finally {
            llilliilililliil.IiIlliIliiIl(show, (boolean)((int)(var14 >>> 32)));
            IliiIilliiIi.lIiiIiIlilli(var11);
         }
      }
   }

   private static void IIIIllIIIl(liIilliiiIilli fl) {
      fl.iiIlliIIIl = fl.iiIlliIIIl + liiIlilIIl * 1000.0F / fl.IIllliIIIl;
      llIllIliilIllIli var3 = fl.iIIlliIIIl == 0 ? fl.lIIlliIIIl.IIlilIliiIli() : null;
      float var1;
      float var2;
      if (fl.iIIlliIIIl == 0 && IiillilIIl && var3 != null) {
         Illillliilli(var3.Illlllllilll(), iilIlilIIl);
         var1 = iilIlilIIl[0];
         var2 = iilIlilIIl[1];
      } else if (fl.iIIlliIIIl == 0) {
         var1 = IiillilIIl ? (iiillilIIl + lIIililIIl) * 0.5F : fl.llIlliIIIl;
         var2 = IiillilIIl ? IIIililIIl + (iIIililIIl - IIIililIIl) * 0.42F : fl.ilIlliIIIl;
      } else if (fl.iIIlliIIIl == 1) {
         var1 = fl.lIIlliIIIl.iIIllIllIi;
         var2 = fl.lIIlliIIIl.IlIllIllIi;
      } else {
         var1 = fl.lIIlliIIIl.llIllIllIi + fl.lIIlliIIIl.iliIlIllIi * 0.5F;
         var2 = fl.lIIlliIIIl.ilIllIllIi + 7.0F;
      }

      if (fl.iiIlliIIIl >= 1.0F) {
         fl.IiIlliIIIl = var1;
         fl.liIlliIIIl = var2;
         Iiiiliiiiiii(fl);
      } else {
         float var4 = fl.iIIlliIIIl == 0 ? llilliilililliil.iIlIlllllill(fl.iiIlliIIIl) : llilliilililliil.IilliliilIIi(fl.iiIlliIIIl, 0.6F);
         fl.IiIlliIIIl = fl.llIlliIIIl + (var1 - fl.llIlliIIIl) * var4;
         fl.liIlliIIIl = fl.ilIlliIIIl + (var2 - fl.ilIlliIIIl) * var4;
      }
   }

   private static void iIlllIllll(float h, float x, float edge, float r, float fill, int w, int y) {
      if (IilIIIIililIIIIi.liiiIIllIl()) {
         IlIllllIll(h, x, edge, r, fill, w);
         ilIllIiIll(h, x, edge, r, fill, IIIiiIillIIiiIil.Illlllllilll(), y);
      } else {
         IIllllIlll(h, x, edge, r, fill, w, y);
      }
   }

   private static void ilillIiill(class_332 my, float mx, float ctx) {
      long var16 = -7528369396055055988L;
      if (!iIiIlilIIl) {
         float var3 = IliiIilliiIi.ilIlllIIlIiIlllIIl;

         try {
            IIlllIlliIll();
            float var4 = 24.0F;
            float var5 = 24.0F;
            float var6 = 112.0F;
            float var7 = lllIlilIIl.iliIiIlilIiiIiIlil;
            iIlllIllll(var4, var5, var6, var7, 10.0F, IilIIIIililIIIIi.iIlIlllllill(), 352321535);
            float var8 = var4 + 7.0F + 1.0F;
            Iillllilll(IilIililIi<"IilIililIi","LlbJCZJT9rfaFXsMHg+OcSvInRutQE7JX83dlT+zLQRi2aJ2">(), var8, var5 + 4.5F, 1.12F, -920587);
            Iillllilll(
               IilIililIi<"IilIililIi","LlbJCZJT9rfaFXsMHg+OcSvInRutQE7JX83dlT+zLQRi2aJ2">(),
               var8 + IIIiiIillIIiiIil.Illlllllilll(),
               var5 + 4.5F,
               1.12F,
               llilliilililliil.IIIIllIIIl(-920587, 0.55F)
            );
            Iillllilll(
               IilIililIi<"IilIililIi","UwjmOG8g6R9xzz4jB0QrgapXMo+VRC0jBAySvu6fZcErS9A9tPPbDXsMabWIZJjwXl/mOg==">(),
               var8,
               var5 + 17.5F,
               0.8F,
               IilIIIIililIIIIi.Illlllllilll(-7630437, Ilillllill(), (double)iiIllilIIl)
            );
            my.method_44379(
               (int)Math.floor((double)var4), (int)Math.floor((double)var5), (int)Math.ceil((double)(var4 + var6)), (int)Math.ceil((double)(var5 + var7))
            );

            try {
               llIllIliilIllIli var9 = null;
               llIllIliilIllIli[] var10 = iIlIlilIIl;
               var16 ^= ((long)var10.length << 32 ^ var16) & -1L << 32;

               for (long var28 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var28 < (int)(var28 >>> 32); var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
                  llIllIliilIllIli var13 = var10[(int)var28];
                  if (!(var13.lllIlIllIi <= 0.01F)) {
                     if (lIlllilIIl == var13 && !IllllilIIl) {
                        var9 = var13;
                     } else {
                        liilliiill(my, var13, mx, ctx);
                     }
                  }
               }

               if (var9 != null) {
                  liilliiill(my, var9, mx, ctx);
               }

               IiIilliIil();
            } finally {
               my.method_44380();
            }
         } catch (Throwable var25) {
            iIlIlllllill(IilIililIi<"IilIililIi","oI30+Q50GmAivJRS9RIGbLaPhiQxhzdVI+7yDCIbdL0R">(), var25);
         } finally {
            IliiIilliiIi.ilIlllIIlIiIlllIIl = var3;
         }
      }
   }

   private static void ilIllIiIll(float line, float w, float r, float y, float x, float h, int argb) {
      float var7 = (float)(argb >>> 24 & 0xFF) / 255.0F * IliiIilliiIi.ilIlllIIlIiIlllIIl;
      if (!(r <= 0.0F) && !(y <= 0.0F) && !(var7 <= 0.003F)) {
         float var8 = IliiIilliiIi.Illlllllilll();
         IliiIilliiIi.Iiilliiliiil(
            lIIlliIIll(),
            line - 1.0F,
            w - 1.0F,
            line + r + 1.0F,
            w + y + 1.0F,
            line / var8,
            w / var8,
            r / var8,
            y / var8,
            Math.min(x, Math.min(r, y) * 0.5F) / var8,
            h / var8,
            (float)(argb >> 16 & 0xFF) / 255.0F,
            (float)(argb >> 8 & 0xFF) / 255.0F,
            (float)(argb & 0xFF) / 255.0F,
            var7
         );
      }
   }

   private static void IIIillIIil(llIllIliilIllIli e, float rx, float top, float my, float over, float mx, boolean rw) {
      long var19 = 5714673899450943632L;
      long var21 = 4440999070972755133L;
      long var23 = 1383566393672215751L;
      float var7 = e.Iiilliiliiil() * 0.8F;
      Iillllilll(
         e.IiIlliIliiIl(),
         rx + top - 7.0F - var7,
         iliIiiliiiii(my, 24.0F, 0.8F),
         0.8F,
         IilIIIIililIIIIi.Illlllllilll(-7630437, Ilillllill(), 0.45 + 0.55 * (double)e.lilIlIllIi)
      );
      float var8 = rx + 5.0F;
      float var9 = my + 24.0F - 2.0F;
      float var10 = top - 10.0F;
      float var11 = 15.0F;
      iIlllIllll(var8, var9, var10, var11, 5.0F, IilIIIIililIIIIi.IlIlllIlilIl(), IilIIIIililIIIIi.IIillIiliIil());
      var19 ^= ((long)e.iIIIlIllIi << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)e.iliIiiliiiii() ^ var19) & -1L >>> 32;
      float var14 = (var10 - 2.0F) / (float)((int)(var19 >>> 32));
      if (!e.IllIlIllIi) {
         e.IllIlIllIi = true;
         e.iIiIlIllIi = (float)((int)var19) * var14;
      } else {
         e.iIiIlIllIi = IIIllIIliIIl(e.iIiIlIllIi, (float)((int)var19) * var14, 20.0F);
      }

      IlIllllIll(var8 + 1.0F + e.iIiIlIllIi, var9 + 1.0F, var14, var11 - 2.0F, 4.0F, llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.92F));
      var21 ^= ((long)(rw ? lIlIliIlIl(e, over, mx) : -1) << 32 ^ var21) & -1L << 32;

      for (long var28 = var21 ^ (0L ^ var21) & -1L >>> 32; (int)var28 < (int)(var19 >>> 32); var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
         e.IiIIlIllIi[(int)var28] = IIIllIIliIIl(e.IiIIlIllIi[(int)var28], (int)(var28 >>> 32) == (int)var28 && (int)var28 != (int)var19 ? 1.0F : 0.0F, 16.0F);
         float var17 = llilliilililliil.IliIlllilIi(1.0F - Math.abs(e.iIiIlIllIi - (float)((int)var28) * var14) / var14);
         var23 ^= (
               (long)IilIIIIililIIIIi.Illlllllilll(
                        IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)e.IiIIlIllIi[(int)var28]), llilliilililliil.Iiiiliiiiiii(), (double)var17
                     )
                     << 32
                  ^ var23
            )
            & -1L << 32;
         iIIilIlIil(
            e.IlIIlIllIi[(int)var28], var8 + 1.0F + (float)((int)var28) * var14 + (var14 - 12.0F) * 0.5F, var9 + (var11 - 11.0F) * 0.5F, (int)(var23 >>> 32)
         );
      }
   }

   private static void iiIilIIlil(class_332 progress, float ctx) {
      long var11 = 6703025698145758879L;
      if (!iIiIlilIIl) {
         float var2 = IlIlllIlilIl((ctx - 0.35F) / 0.65F);
         class_4587 var3 = CorzClient.fontManager.liiiIIllIl();
         class_4587 var4 = IIIiiIillIIiiIil.liiiIIllIl();
         float var5 = IliiIilliiIi.ilIlllIIlIiIlllIIl;
         CorzClient.fontManager.iIlIlllllill(IilIlilIIl);
         IIIiiIillIIiiIil.IliIlllilIi(IilIlilIIl);

         try {
            IIlllIlliIll();
            if (!(var2 <= 0.004F)) {
               IliiIilliiIi.ilIlllIIlIiIlllIIl = var5 * var2;
               if (IiillilIIl) {
                  lIliliIlil();
                  illilIilil(progress);
                  Illillllil(progress);
                  lililiilil(progress);
               }

               liIilliiiIilli[] var6 = IllIlilIIl;
               var11 ^= ((long)var6.length << 32 ^ var11) & -1L << 32;

               for (long var18 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
                  liIilliiiIilli var9 = var6[(int)var18];
                  if (var9.IlIlliIIIl) {
                     iIiilIliil(progress, var9);
                  }
               }

               if (iIlllilIIl != null) {
                  lliililiil(progress, iIlllilIIl, iilllilIIl, IIillilIIl, 0.86F + 0.18F * IlIlllIlilIl(IlillilIIl), IlillilIIl, llillilIIl);
               }

               return;
            }
         } catch (Throwable var15) {
            iIlIlllllill(IilIililIi<"IilIililIi","+g/kV1hrjrJrsFibyVQ9Pddy6yloQ23+eu4kNwzpGWMYa9M=">(), var15);
            return;
         } finally {
            IliiIilliiIi.ilIlllIIlIiIlllIIl = var5;
            CorzClient.fontManager.iIlIlllllill(var3);
            IIIiiIillIIiiIil.IliIlllilIi(var4);
         }
      }
   }

   private static void IiIilliIil() {
      float var0 = IlIlllIlilIl(liIllilIIl);
      if (!(var0 <= 0.01F)) {
         if (lilililIIl < 0.0F) {
            lilililIIl = llilliilililliil.llIIlilIIl(IilIililIi<"IilIililIi","XVaof2UNSNh9vh+kgo4isPQs71+j6k+0s8cT9RFLO4bR8YX7YR/gjDB6NmI=">());
            iilililIIl = llilliilililliil.llIIlilIIl(IilIililIi<"IilIililIi","chuxwYorprivrJ8qP47PfNrN15YUps8cGIkLAqc5DAxqhCEL+OPhDe+R">());
         }

         float var1 = 80.0F;
         float var2 = IiIllilIIl + (1.0F - var0) * 4.0F;
         float var3 = IliiIilliiIi.IilliliilIIi(var0);

         try {
            float var4 = 16.0F;
            IlIllllIll(var1 - var4 * 0.5F, var2 + 2.0F, var4, var4, var4 * 0.5F, llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.16F));
            lllllillll(lIlIIiliIlIIil.liiiIIllIl(), var1 - 5.0F, var2 + 5.0F, 10.0F, Ilillllill());
            Iillllilll(
               IilIililIi<"IilIililIi","XVaof2UNSNh9vh+kgo4isPQs71+j6k+0s8cT9RFLO4bR8YX7YR/gjDB6NmI=">(),
               var1 - lilililIIl * 0.86F * 0.5F,
               var2 + 19.5F,
               0.86F,
               -920587
            );
            Iillllilll(
               IilIililIi<"IilIililIi","chuxwYorprivrJ8qP47PfNrN15YUps8cGIkLAqc5DAxqhCEL+OPhDe+R">(),
               var1 - iilililIIl * 0.86F * 0.5F,
               var2 + 29.5F,
               0.86F,
               -7630437
            );
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var3);
         }
      }
   }

   private static void Illillliilli(int z, float[] out) {
      IiIiliIiiiIi(z, liiililIIl);
      out[0] = liiililIIl[0] + liiililIIl[2] * 0.5F;
      out[1] = liiililIIl[1] + liiililIIl[3] * 0.5F;
   }

   private static int lIlIliIlIl(llIllIliilIllIli e, float mx, float my) {
      if (e.IIiiIIllIi && e.iIIIlIllIi != 0) {
         float var3 = 31.0F;
         float var4 = 98.0F;
         float var5 = e.illIlIllIi + (e.IilIlIllIi - e.IIIilIIiiIIi()) * 0.5F;
         float var6 = var3 + 5.0F;
         float var7 = var5 + 24.0F - 2.0F;
         float var8 = var4 - 10.0F;
         float var9 = 15.0F;
         return !(mx < var6) && !(mx > var6 + var8) && !(my < var7 - 1.0F) && !(my > var7 + var9 + 1.0F)
            ? class_3532.method_15340((int)((mx - var6 - 1.0F) / ((var8 - 2.0F) / (float)e.iIIIlIllIi)), 0, e.iIIIlIllIi - 1)
            : -1;
      } else {
         return -1;
      }
   }

   private static boolean iIiIlIliIl(float button, float y, int x) {
      if (x == 0 && iIlllilIIl == null) {
         llIllIliilIllIli var3 = IIiIllIiIl(button, y);
         if (var3 == null) {
            return false;
         } else {
            lIlllilIIl = var3;
            IllllilIIl = true;
            lllllilIIl = button >= var3.llIllIllIi + var3.iliIlIllIi - 12.0F;
            IilllilIIl = button;
            lilllilIIl = y;
            return true;
         }
      } else {
         return false;
      }
   }

   private static float IlIillIiilIi(int z) {
      return Math.max(22.0F, IIIilIIiiIIi(z) * 0.78F + 12.0F + 4.0F);
   }

   private static boolean IIiilIiiiIii(llIllIliilIllIli e, int mode) {
      long var6 = -2788544576186916881L;
      liIilliiiIilli[] var2 = IllIlilIIl;
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         liIilliiiIilli var5 = var2[(int)var9];
         if (var5.IlIlliIIIl && var5.lIIlliIIIl == e && var5.iIIlliIIIl == mode) {
            return true;
         }
      }

      return false;
   }

   private static int IIillIiliIil(float x, float chip, boolean y) {
      long var8 = -3488888326031170075L;
      if (!Ililllililil(x, chip) && (!y || !Iiilliiliiil(x, chip))) {
         for (long var10 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var10 >>> 32) < 4; var10 += 4294967296L) {
            IiIiliIiiiIi((int)(var10 >>> 32), iiiililIIl);
            if (x >= iiiililIIl[0] && x <= iiiililIIl[0] + iiiililIIl[2] && chip >= iiiililIIl[1] && chip <= iiiililIIl[1] + iiiililIIl[3]) {
               return (int)(var10 >>> 32);
            }
         }

         float var3 = 33.0F;
         if (!(x < iiillilIIl - 3.0F - IlIillIiilIi(2) - 8.0F)
            && !(x > lIIililIIl + 3.0F + IlIillIiilIi(3) + 8.0F)
            && !(chip < IIIililIIl - var3)
            && !(chip > iIIililIIl + var3)) {
            float var4 = (iiillilIIl + lIIililIIl) * 0.5F;
            float var5 = (IIIililIIl + iIIililIIl) * 0.5F;
            float var6 = Math.abs(x - var4) - (lIIililIIl - iiillilIIl) * 0.5F;
            float var7 = Math.abs(chip - var5) - (iIIililIIl - IIIililIIl) * 0.5F;
            return var6 > var7 ? (x < var4 ? 2 : 3) : (chip < var5 ? 0 : 1);
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   public static boolean ilIIiIiIIi(String name, boolean on) {
      llIllIliilIllIli var2 = Iiiilliiil(name);
      if (var2 == null) {
         return false;
      } else {
         var2.IliIlllilIi();
         var2.lIiiIiIlilli(on);
         return var2.iIlIlllllill() == on;
      }
   }

   private static void Iliilliiilii(llIllIliilIllIli fromY, int fromX, float mode, float e) {
      long var9 = -7042411171235065077L;
      liIilliiiIilli var4 = null;
      liIilliiiIilli[] var5 = IllIlilIIl;
      var9 ^= ((long)var5.length << 32 ^ var9) & -1L << 32;

      for (var9 ^= (0L ^ var9) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         liIilliiiIilli var8 = var5[(int)var9];
         if (var8.IlIlliIIIl && var8.lIIlliIIIl == fromY) {
            var4 = var8;
            break;
         }
      }

      if (var4 == null) {
         var5 = IllIlilIIl;
         var9 ^= ((long)var5.length << 32 ^ var9) & -1L << 32;

         for (var9 ^= (0L ^ var9) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            liIilliiiIilli var13 = var5[(int)var9];
            if (!var13.IlIlliIIIl) {
               var4 = var13;
               break;
            }
         }
      }

      if (var4 == null) {
         var4 = IllIlilIIl[0];
         var5 = IllIlilIIl;
         var9 ^= ((long)var5.length << 32 ^ var9) & -1L << 32;

         for (long var19 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var19 < (int)(var19 >>> 32); var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
            liIilliiiIilli var14 = var5[(int)var19];
            if (var14.iiIlliIIIl > var4.iiIlliIIIl) {
               var4 = var14;
            }
         }

         Iiiiliiiiiii(var4);
      }

      var4.lIIlliIIIl = fromY;
      var4.iIIlliIIIl = fromX;
      var4.IlIlliIIIl = true;
      var4.llIlliIIIl = mode;
      var4.ilIlliIIIl = e;
      var4.IiIlliIIIl = mode;
      var4.liIlliIIIl = e;
      var4.iiIlliIIIl = 0.0F;
      var4.IIllliIIIl = fromX == 0 ? 300.0F : 340.0F;
   }

   private static Color iiiIlIIIll(int argb) {
      long var3 = 8655417379638420061L;
      var3 ^= ((long)(argb * -1640531535 >>> 25) << 32 ^ var3) & -1L << 32;
      Color var2 = lIiIlilIIl[(int)(var3 >>> 32)];
      if (var2 == null || IIiIlilIIl[(int)(var3 >>> 32)] != argb) {
         var2 = new Color(argb, true);
         lIiIlilIIl[(int)(var3 >>> 32)] = var2;
         IIiIlilIIl[(int)(var3 >>> 32)] = argb;
      }

      return var2;
   }

   private static class_2960 iilllIIill() {
      if (iliIlilIIl == null) {
         iliIlilIIl = lIlIIiliIlIIil.IIIIllIIIl(IilIililIi<"IilIililIi","jMO85NhwHP4iHdIjEZMrk/P77lAHUmpR6QJerIhwhWPv">());
      }

      return iliIlilIIl;
   }

   private static void lililiilil(class_332 ctx) {
      if (illililIIl < 0.0F) {
         illililIIl = llilliilililliil.llIIlilIIl(IilIililIi<"IilIililIi","qXjgUQc49d/kxZshKx5t30SaHAkMt4cNSGBBn+dZ7FqcX4S5D+ARZYzQ">());
         IilililIIl = llilliilililliil.llIIlilIIl(IilIililIi<"IilIililIi","AVvJDbRcFGMYwb2E+UqYuo1OLaIqBRUi/hBbl5FqkX1squu5F/NflQ2zsYGK">());
      }

      IIiillIiil(
         ctx,
         IilIililIi<"IilIililIi","qXjgUQc49d/kxZshKx5t30SaHAkMt4cNSGBBn+dZ7FqcX4S5D+ARZYzQ">(),
         illililIIl,
         iIlililIIl,
         llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.94F),
         llilliilililliil.Iiiiliiiiiii()
      );
      IIiillIiil(
         ctx,
         IilIililIi<"IilIililIi","AVvJDbRcFGMYwb2E+UqYuo1OLaIqBRUi/hBbl5FqkX1squu5F/NflQ2zsYGK">(),
         IilililIIl,
         IllililIIl,
         llilliilililliil.IIIIllIIIl(-1750963, 0.94F),
         -1
      );
   }

   private static float IlIlllIlilIl(float v) {
      v = llilliilililliil.IliIlllilIi(v);
      return v * v * (3.0F - 2.0F * v);
   }

   private static void lliililiil(class_332 danger, llIllIliilIllIli alpha, float cy, float ctx, float cx, float scale, float e) {
      long var16 = 1658139198588097792L;
      if (!(scale <= 0.01F)) {
         float var7 = alpha.Iiilliiliiil() * 0.92F;
         float var8 = 21.0F + var7 + 8.0F;
         float var9 = 17.0F;
         float var10 = cy - var8 * 0.5F;
         float var11 = ctx - var9 * 0.5F;
         var16 ^= ((long)IilIIIIililIIIIi.Illlllllilll(llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 1.0F), -1750963, (double)e) << 32 ^ var16)
            & -1L << 32;
         float var13 = IliiIilliiIi.IilliliilIIi(scale);
         var16 ^= ((long)llilliilililliil.IlIlllIlilIl(danger, cy, ctx, cx) ^ var16) & -1L >>> 32;

         try {
            liIlliiIll(var10 + 1.0F, var11 + 3.5F, var8 - 2.0F, var9, 6.0F, 1879048192, 9.0F, 0.6F, true);
            liIlliiIll(var10, var11, var8, var9, 6.0F, llilliilililliil.IIIIllIIIl((int)(var16 >>> 32), 0.34F), 5.0F, 0.85F, false);
            IIllllIlll(
               var10,
               var11,
               var8,
               var9,
               6.0F,
               IilIIIIililIIIIi.Illlllllilll(-15591908, (int)(var16 >>> 32), 0.1),
               llilliilililliil.IIIIllIIIl((int)(var16 >>> 32), 0.88F)
            );
            lllllillll(alpha.IIIllIIliIIl(), var10 + 6.5F, var11 + (var9 - 10.0F) * 0.5F, 10.0F, IilIIIIililIIIIi.Illlllllilll((int)(var16 >>> 32), -1, 0.25));
            Iillllilll(alpha.IiIlliIliiIl(), var10 + 21.0F, iliIiiliiiii(var11, var9, 0.92F), 0.92F, -920587);
         } finally {
            llilliilililliil.IiIlliIliiIl(danger, (boolean)((int)var16));
            IliiIilliiIi.lIiiIiIlilli(var13);
         }
      }
   }

   private static void liilliiill(class_332 mx, llIllIliilIllIli e, float ctx, float my) {
      long var23 = 3566256285159379758L;
      long var25 = -1188801473191743696L;
      long var27 = -7738856319425029613L;
      float var4 = 31.0F;
      float var5 = 98.0F;
      float var6 = e.IIIilIIiiIIi();
      float var7 = e.IilIlIllIi;
      float var8 = e.illIlIllIi;
      var23 ^= ((long)(lIlllilIIl == e && !IllllilIIl ? 1 : 0) << 32 ^ var23) & -1L << 32;
      var23 ^= (
            (long)(
                  lllIlilIIl.lilliIliliilliIlil
                        && iIlllilIIl == null
                        && e.IIlIlIllIi
                        && e.lllIlIllIi > 0.6F
                        && ctx >= var4
                        && ctx <= var4 + var5
                        && my >= var8
                        && my <= var8 + var7
                     ? 1
                     : 0
               )
               ^ var23
         )
         & -1L >>> 32;
      e.lilIlIllIi = IIIllIIliIIl(
         e.lilIlIllIi, (int)var23 == 0 && (int)(var23 >>> 32) == 0 ? 0.0F : 1.0F, (int)var23 == 0 && (int)(var23 >>> 32) == 0 ? 11.0F : 16.0F
      );
      e.iilIlIllIi = IIIllIIliIIl(e.iilIlIllIi, (int)(var23 >>> 32) != 0 && iIlllilIIl == null ? 1.0F : 0.0F, 18.0F);
      if (!(var7 < 3.0F)) {
         float var11 = Math.min(1.0F, e.lllIlIllIi * 1.8F);
         float var12 = llilliilililliil.IliIlllilIi((e.lllIlIllIi - 0.55F) / 0.45F) * (1.0F - 0.86F * e.IIiIlIllIi);
         float var13 = 1.0F + 0.04F * e.iilIlIllIi + 0.05F * IiIlliIliiIl(e.lIiIlIllIi);
         float var14 = IliiIilliiIi.IilliliilIIi(var11);
         var25 ^= ((long)llilliilililliil.IlIlllIlilIl(mx, var4 + var5 * 0.5F, var8 + var7 * 0.5F, var13) << 32 ^ var25) & -1L << 32;

         try {
            if (e.iilIlIllIi > 0.01F) {
               liIlliiIll(var4 + 1.0F, var8 + 2.5F, var5 - 2.0F, var7, 6.0F, llilliilililliil.IIIIllIIIl(-16777216, 0.46F * e.iilIlIllIi), 7.0F, 0.55F, true);
            }

            var25 ^= (
                  (long)IilIIIIililIIIIi.Illlllllilll(
                        IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), -1, 0.035 * (double)e.lilIlIllIi + 0.03 * (double)e.iilIlIllIi),
                        IilIIIIililIIIIi.IlIlllIlilIl(),
                        (double)e.IIiIlIllIi
                     )
                     ^ var25
               )
               & -1L >>> 32;
            var27 ^= (
                  (long)IilIIIIililIIIIi.Illlllllilll(
                           IilIIIIililIIIIi.Illlllllilll(234881023, IilIIIIililIIIIi.IIlllIlliIll(0.52), (double)Math.max(e.lilIlIllIi * 0.55F, e.iilIlIllIi)),
                           IilIIIIililIIIIi.IIlllIlliIll(0.26),
                           (double)e.IIiIlIllIi
                        )
                        << 32
                     ^ var27
               )
               & -1L << 32;
            iIlllIllll(var4, var8, var5, var7, 6.0F, (int)var25, (int)(var27 >>> 32));
            if (!(var12 <= 0.01F)) {
               float var18 = IliiIilliiIi.IilliliilIIi(var12);

               try {
                  float var19 = var8 + (var7 - var6) * 0.5F;
                  var27 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-7630437, Ilillllill(), (double)e.lilIlIllIi) ^ var27) & -1L >>> 32;
                  lllllillll(e.IIIllIIliIIl(), var4 + 6.0F, var19 + 6.5F, 11.0F, (int)var27);
                  Iillllilll(
                     e.lIliIIllIi, var4 + 22.0F, iliIiiliiiii(var19, 24.0F, 1.0F), 1.0F, IilIIIIililIIIIi.Illlllllilll(-5854026, -920587, (double)e.lilIlIllIi)
                  );
                  if (e.IIiiIIllIi) {
                     IIIillIIil(e, var4, var5, var19, ctx, my, (boolean)((int)var23));
                  } else {
                     llIililIil(e.llliIIllIi, var4 + var5 - 6.0F - 20.0F, var19 + 5.0F, e.lilIlIllIi);
                  }

                  return;
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var18);
               }
            }
         } finally {
            llilliilililliil.IiIlliIliiIl(mx, (boolean)((int)(var25 >>> 32)));
            IliiIilliiIi.lIiiIiIlilli(var14);
         }
      }
   }

   private static void lliIliliIl(float x, float y) {
      if (lIlllilIIl != null && IllllilIIl && !lllllilIIl && iIlllilIIl == null) {
         float var2 = x - IilllilIIl;
         float var3 = y - lilllilIIl;
         if (var2 * var2 + var3 * var3 >= 9.0F) {
            llIIlilIIl(lIlllilIIl, true, lIlllilIIl.llIllIllIi + lIlllilIIl.iliIlIllIi * 0.5F, lIlllilIIl.ilIllIllIi + 7.0F);
         }
      }
   }

   private static float IiIlliIliiIl(float v) {
      return v <= 0.0F ? 0.0F : class_3532.method_15374((double)((float) Math.PI * (1.0F - v)));
   }

   private static int lIilliIill() {
      return llIllilIIl > 0.6F ? -10494866 : (llIllilIIl > 0.3F ? -2045912 : -2077877);
   }

   private static boolean IllIllllIl(float mx, float my, int button) {
      long var5 = -8296078075635894206L;
      if (!iIiIlilIIl && button == 0 && iIlllilIIl == null) {
         llIllIliilIllIli var3 = iiIIlIIlIl(mx, my);
         if (var3 == null) {
            return true;
         } else {
            var5 ^= ((long)lIlIliIlIl(var3, mx, my) << 32 ^ var5) & -1L << 32;
            if ((int)(var5 >>> 32) >= 0) {
               if (var3.iliiIIllIi.Ililllililil() != (int)(var5 >>> 32)) {
                  var3.iliiIIllIi.Iiilliiliiil((int)(var5 >>> 32));
               }

               return true;
            } else {
               lIlllilIIl = var3;
               IllllilIIl = false;
               lllllilIIl = false;
               IilllilIIl = (float)iIIlIllIlIlIll.iiIIlIIlIl();
               lilllilIIl = (float)iIIlIllIlIlIll.lIlIliIlIl();
               return true;
            }
         }
      } else {
         return true;
      }
   }

   private static void IIlIilIlIi(int out, float[] z) {
      IiIiliIiiiIi(out, iiiililIIl);
      float var2 = iiiililIIl[1] + iiiililIIl[3];
      float var3 = iiiililIIl[0] + iiiililIIl[2];
      float var4 = llIililIIl + liIililIIl + 2.0F;
      float var5 = IlIililIIl + 2.0F;
      if (var4 < var2 - 2.0F) {
         z[1] = (var4 + var2) * 0.5F;
      } else if (llIililIIl - 2.0F > iiiililIIl[1] + 2.0F) {
         z[1] = (iiiililIIl[1] + llIililIIl - 2.0F) * 0.5F;
      } else if (var5 < var3 - 2.0F) {
         z[0] = (var5 + var3) * 0.5F;
      }
   }

   static boolean liiiIIllIl(class_332 icons, float ctx, boolean tickDelta) {
      lIIIlilIIl.IliIlllilIi();
      if (lIIIlilIIl.IliiIIllIi instanceof iliIliIlIiiIliIl var3 && var3.IliIlllilIi()) {
         return var3.ilIllIiIll(icons, ctx, tickDelta);
      }

      return false;
   }

   private static boolean Iiilliiliiil(float y, float x) {
      return IiIililIIl > 0.5F
         && ilIililIIl > 0.0F
         && liIililIIl > 0.0F
         && y >= IlIililIIl - ilIililIIl - 1.0F
         && y <= IlIililIIl + 1.0F
         && x >= llIililIIl - 1.0F
         && x <= llIililIIl + liIililIIl + 1.0F;
   }

   private static void Iillllilll(String x, float s, float argb, float scale, int y) {
      if (Math.abs(scale - 1.0F) < 0.001F) {
         llilliilililliil.IIiilIiiiIii().IliIlllilIi(x, s, argb, iiiIlIIIll(y));
      } else {
         class_4587 var5 = IIIiiIillIIiiIil.liiiIIllIl();
         var5.method_22903();
         var5.method_22905(scale, scale, 1.0F);
         llilliilililliil.IIiilIiiiIii().IliIlllilIi(x, s / scale, argb / scale, iiiIlIIIll(y));
         var5.method_22909();
      }
   }

   public static boolean liIIiiiIIi(String out, float[] zone) {
      long var3 = 2956390586608159135L;
      if (!IiillilIIl) {
         return false;
      } else {
         for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < IiilIilIIl.length; var5 += 4294967296L) {
            if (IiilIilIIl[(int)(var5 >>> 32)].equalsIgnoreCase(out)) {
               Illillliilli((int)(var5 >>> 32), zone);
               if (Iiilliiliiil(zone[0], zone[1])) {
                  IIlIilIlIi((int)(var5 >>> 32), zone);
               }

               return true;
            }
         }

         return false;
      }
   }

   private static void iIlIlllllill(String t, Throwable where) {
      iIiIlilIIl = true;
      lllIlilIIl.illliIlilIilliIlil = false;
      lIlllilIIl = null;
      iIlllilIIl = null;
   }

   private static Matrix4f lIIlliIIll() {
      return IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
   }

   private static boolean lilIliilIl() {
      long var6 = 7663674897788568113L;
      lIlllilIIl = null;
      if (!iIiIlilIIl && iIlllilIIl != null && !illllilIIl) {
         llIllIliilIllIli var0 = iIlllilIIl;
         iIlllilIIl = null;
         float var1 = (float)iIIlIllIlIlIll.iiIIlIIlIl();
         float var2 = (float)iIIlIllIlIlIll.lIlIliIlIl();
         var6 ^= ((long)(iIIlIllIlIlIll.IllIllllIl() && IiillilIIl ? 1 : 0) << 32 ^ var6) & -1L << 32;
         llIllIliilIllIli var4 = var0.IIlilIliiIli();
         var6 ^= ((long)(var4 != null && (int)(var6 >>> 32) != 0 ? IIillIiliIil(var1, var2, false) : -1) ^ var6) & -1L >>> 32;
         if ((int)var6 >= 0 && var0.IIlllIlliIll()) {
            var0.Iilllilliill((int)var6);
         }

         if ((int)(var6 >>> 32) != 0 && (var4 != null ? (int)var6 >= 0 : Iilllilliill(var1, var2))) {
            var0.lIiiIiIlilli(true);
            if (var0.iIlIlllllill()) {
               Iliilliiilii(var0, 0, iilllilIIl, IIillilIIl);
               lllililIIl = 0.0F;
               return true;
            }
         }

         Iliilliiilii(var0, 1, iilllilIIl, IIillilIIl);
         return true;
      } else {
         return true;
      }
   }

   private static boolean Iilllilliill(float y, float x) {
      float var2 = (iiillilIIl + lIIililIIl) * 0.5F;
      float var3 = (IIIililIIl + iIIililIIl) * 0.5F;
      float var4 = Math.max(lIIililIIl - iiillilIIl, 34.0F) * 0.5F * 1.2F;
      float var5 = Math.max(iIIililIIl - IIIililIIl, 56.0F) * 0.5F * 1.2F;
      return y >= var2 - var4 && y <= var2 + var4 && x >= var3 - var5 && x <= var3 + var5;
   }
}
