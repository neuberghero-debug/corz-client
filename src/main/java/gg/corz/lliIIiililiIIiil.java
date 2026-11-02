package gg.corz;

import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Arrays;
import net.minecraft.class_1923;
import org.joml.Matrix4f;

public class lliIIiililiIIiil extends ilIllIiIll {
   private int Iiillillil;
   private final iiIiiilIIliiil Illllillil;
   private static final int IIlllillil = 4096;
   private int iiillillil;
   private final iilliIlIIiliIl Iilllillil;
   private static final int ilIllillil = 16;
   private int lIIilillil;
   private static final int liIllillil = 8;
   private final iiIiiilIIliiil iilllillil;
   private static final int iiIllillil = 4;
   private long[] lIillillil;
   private boolean ilillillil;
   private final iilliIlIIiliIl iIlllillil = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","ZG84Ypc6NF/E87ywzQ5JhynPjcIh1Jgi4YopQvUxtZOeMlTMmTGS">(),
      IliIlllilIi<"IliIlllilIi","m19JNxVMIc0lbi9UEKzA2vxSNAgt82ZpfzsNawv5Zg4GbByao8KZsBqlM5puP3oLq1SWN7bMZ3iIAcSiELKwwg==">(),
      16,
      1,
      32
   );
   private final iilliIlIIiliIl illllillil;
   private final iiIiiilIIliiil lllllillil;
   private static final int lIlllillil = 64;
   private int[] iIillillil;
   private static final int IiIllillil = 256;
   private int liillillil;
   private int IIIilillil;
   private int llillillil;
   private final LongOpenHashSet IIillillil;
   private int[] Ilillillil;
   private final iliiliilIiiiliil lilllillil;

   @Override
   protected void Iilililiiili() {
      this.iiiIlIIIll();
   }

   @Override
   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var1 = System.identityHashCode(Iiiilllliiilll.field_1687);
         if (var1 != this.lIIilillil) {
            this.lIIilillil = var1;
            this.iiiIlIIIll();
         }

         int var2 = Iiiilllliiilll.field_1724.method_31477() >> 4;
         int var3 = Iiiilllliiilll.field_1724.method_31479() >> 4;
         if (this.IIIilillil++ % 4 == 0) {
            int var4 = this.iIlllillil.Iilllilliill();

            for (iIiilIllIliilIll var6 : liilliIiiiilliIi.ilIiiliIIi.iIliiliIIi.values()) {
               if (Math.abs(var6.liIiIlilll - var2) <= var4 && Math.abs(var6.iiIiIlilll - var3) <= var4) {
                  long var7 = class_1923.method_8331(var6.liIiIlilll, var6.iiIiIlilll);
                  if (!this.IIillillil.contains(var7) && this.ilIllIiIll(var6)) {
                     this.IIillillil.add(var7);
                     this.ilillillil = true;
                     this.liIlliiIll(var6.liIiIlilll, var6.iiIiIlilll);
                  }
               }
            }

            if (this.IIillillil.size() > 4096) {
               this.lIIlliIIll(var2, var3);
            }
         }

         int var9 = this.Iilllillil.Iilllilliill();
         if (this.ilillillil || var2 != this.Iiillillil || var3 != this.liillillil || var9 != this.iiillillil) {
            this.IlIllllIll(var2, var3, var9);
         }
      }
   }

   private void liIlliiIll(int cz, int cx) {
      long var5 = -698728277398830211L;
      var5 ^= ((long)((cz << 4) + (~(-110436090 * 1483715975 - 11) ^ 1173362664)) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)((cx << 4) + ((-1884310058 ^ 41) * 1749801491 - -105 - 53 ^ 884647977)) ^ var5) & -1L >>> 32;
      if (this.Illllillil.Iilllilliill()) {
         Iliiiiilliiiii.IliIlllilIi()
            .iIlIlllllill(
               IliIlllilIi<"IliIlllilIi","fZso0/P70d0mNW7E3WyJYcEOBCWMJIFHZdYkm43jXE5OdtCqU3kr69sVhuheNNE=">(),
               String.format(
                  IliIlllilIi<"IliIlllilIi","al1jd8blUOzlLyVOfmoViW+9j3FMu4BZxAi/OwCPAVFkOxULPd4VYPMu4NxDQPfKCpJjv16RV5F0lcCgu2ytJUk=">(),
                  cz,
                  cx,
                  (int)(var5 >>> 32),
                  (int)var5
               ),
               true
            );
      }

      if (this.lllllillil.Iilllilliill()) {
         IilIlllilIll.IliIlllilIi();
      }
   }

   private void lIIlliIIll(int px, int pz) {
      LongIterator var3 = this.IIillillil.iterator();

      while (var3.hasNext()) {
         long var4 = var3.nextLong();
         if (Math.abs(class_1923.method_8325(var4) - px) > 64 || Math.abs(class_1923.method_8332(var4) - pz) > 64) {
            var3.remove();
         }
      }

      this.ilillillil = true;
   }

   private void iiiIlIIIll() {
      this.IIillillil.clear();
      this.llillillil = 0;
      this.ilillillil = true;
      this.IIIilillil = 0;
   }

   private void IlIllllIll(int rd, int pz, int px) {
      this.ilillillil = false;
      this.Iiillillil = rd;
      this.liillillil = pz;
      this.iiillillil = px;
      if (this.lIillillil.length < this.IIillillil.size()) {
         this.lIillillil = new long[Math.max(16, this.IIillillil.size() * 2)];
      }

      int var4 = 0;
      LongIterator var5 = this.IIillillil.iterator();

      while (var5.hasNext()) {
         long var6 = var5.nextLong();
         int var8 = class_1923.method_8325(var6) - rd;
         int var9 = class_1923.method_8332(var6) - pz;
         if (Math.abs(var8) <= px && Math.abs(var9) <= px) {
            long var10 = (long)var8 * (long)var8 + (long)var9 * (long)var9;
            this.lIillillil[var4++] = var10 << 16 | (long)(var8 + px) << 8 | (long)(var9 + px);
         }
      }

      Arrays.sort(this.lIillillil, 0, var4);
      int var12 = Math.min(var4, 256);
      if (this.iIillillil.length < var12) {
         this.iIillillil = new int[var12];
         this.Ilillillil = new int[var12];
      }

      for (int var7 = 0; var7 < var12; var7++) {
         this.iIillillil[var7] = rd + (int)(this.lIillillil[var7] >> 8 & 255L) - px;
         this.Ilillillil[var7] = pz + (int)(this.lIillillil[var7] & 255L) - px;
      }

      this.llillillil = var12;
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (this.llillillil != 0 && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var2 = Math.max(20, Math.min(255, this.illllillil.Iilllilliill()));
         int var3 = Math.max(5, var2 / 6);
         int var4 = this.lilllillil.Iilllilliill();
         int var5 = var4 >> 16 & 0xFF;
         int var6 = var4 >> 8 & 0xFF;
         int var7 = var4 & 0xFF;
         int var8 = var2 << 24 | var5 << 16 | var6 << 8 | var7;
         float var9 = (float)var5 / 255.0F;
         float var10 = (float)var6 / 255.0F;
         float var11 = (float)var7 / 255.0F;
         float var12 = (float)var3 / 255.0F;
         boolean var13 = this.iilllillil.Iilllilliill();
         Matrix4f var14 = iIiiIIilIliiIIil.IIillIiliIil();
         float var15 = iIiiIIilIliiIIil.Iiilliiliiil(59.0);
         float var16 = iIiiIIilIliiIIil.Iiilliiliiil(61.0);
         int var17 = this.llillillil;

         for (int var18 = 0; var18 < var17; var18++) {
            double var19 = (double)this.iIillillil[var18] * 16.0;
            double var21 = (double)this.Ilillillil[var18] * 16.0;
            if (!iIiiIIilIliiIIil.IlIillIiilIi(var19 + 8.0, 60.0, var21 + 8.0, 12.0F)) {
               float var23 = iIiiIIilIliiIIil.Ililllililil(var19);
               float var24 = iIiiIIilIliiIIil.IIIilIIiiIIi(var21);
               iIiiIIilIliiIIil.IIlilIliiIli(var14, var23, var15, var24, var23 + 16.0F, var16, var24 + 16.0F, var9, var10, var11, var12);
               iIiiIIilIliiIIil.iIIIlIlIIl(var14, var23, var15, var24, var23 + 16.0F, var16, var24 + 16.0F, var8, 2.0F);
            }

            if (var13 && var18 < 8) {
               Iillllilll.Iilllilliill(var19 + 8.0, 60.0, var21 + 8.0, var4, false);
            }
         }

         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   public lliIIiililiIIiil() {
      super(IliIlllilIi<"IliIlllilIi","0q9QNVZmYBq9FHuZfBByj9Y+p02eGKAmg2cBKkgpgr4WXTUkSOZyWyNy9R22CQ==">(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.Illllillil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","YLbCkViwMYqNsgxCUF2wA91IPgDFwyi4IM/9V9x6sw/p">(),
         IliIlllilIi<"IliIlllilIi","CPucPOAwRO9kGtukNaSsIWjXjUBK5S0EbuyxvVp4sJXN0HAkizRDAE34plneMpKQ/HDihQvS+B2QwAQdiZYDMXHldg==">(),
         true
      );
      this.lllllillil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","ZEWo+WKGj2GllHFCKXmOf3IyPWTRQCT0C4TEb0F8VgEt3A+k85I=">(),
         IliIlllilIi<"IliIlllilIi","q4nbnVfL3TGB9elAQ38gVQOJtspcKuvrurUTVwqr75kD1eC65ctf1xysKpv5GYlDkoNjEW8x3t5MaE7/VhJjA1YM6aRQsDAHfEqHNjFYR9EQPu2iKTdQTQDracWYmw==">(),
         true
      );
      this.illllillil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","tQb1d8UGfr69xTohZRlpllmKPjxmpyB/b1cHrSiE/PgE7k0=">(),
         IliIlllilIi<"IliIlllilIi","z18W4TmO6Ud4PmUgYS9GwbR59Qt/6WRLEEb2Yg1sZMhOrxrkvGmP3nTRQUm6U9rXwZYHxK1RaZ3EQ99r">(),
         200,
         0,
         255
      );
      this.Iilllillil = new iilliIlIIiliIl(
         IliIlllilIi<"IliIlllilIi","hK88caMdNiHJK+vstXPmbChm56JS5QZ82vHCOasR07We2Ed+EZ+w2AMLiw==">(),
         IliIlllilIi<"IliIlllilIi","3WTDNKV+Dft2Tz8W7Pi8Lv4rIjWeIfX8JQa+SlEzIOHfC5hepVAoPLfC7hKWaPVDJQ+vj1EMoU98VPWWtXdYYOQTAwSl+7aQ0fy/o2UR41W/Ju9mlTfjn5UwpFWrKibL3+rgJhRQv3GOh+tH5vuHTIJ877U0RbANTujK">(),
         8,
         1,
         32
      );
      this.lilllillil = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","asW/Oi/+4cAa3rdUeD5r0xAfm2GdGvexF5eUmPpXA3oSb1PL1Bg=">(),
         IliIlllilIi<"IliIlllilIi","8O8jYY6oxBPUpeXfDuSlrioQzZZj7UkR2pQlxSzHzDeIXzFbsF7V6ZMwFuplY7efO1sAFXUZuKvzyA==">(),
         -52686
      );
      this.iilllillil = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","SvdkQjpMSNfg5TXHZDGVh4WECLfge+QGoBEtPxOMfHhWra7ISWJtpmU=">(),
         IliIlllilIi<"IliIlllilIi","jr5C6BVJFCmZ3y58GZqm2rdEkm8DvxXrU33hQyQvHCH6gr1XXINmJgNH1tag7XKEOJr0dFT7GeNp57qiJ2t/DIeA7qpBoN73hXeoRa12yrvn6F+yBDkCFS2n2EgNqP76">(),
         true
      );
      this.IIillillil = new LongOpenHashSet();
      this.lIillillil = new long[0];
      this.iIillillil = new int[0];
      this.Ilillillil = new int[0];
      this.ilillillil = true;
      this.Iiillillil = Integer.MIN_VALUE;
      this.liillillil = Integer.MIN_VALUE;
      this.iiillillil = -1;
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{this.iIlllillil, this.Illllillil, this.lllllillil, this.illllillil, this.Iilllillil, this.lilllillil, this.iilllillil}
      );
   }

   private boolean ilIllIiIll(iIiilIllIliilIll snap) {
      for (int var2 = 1; var2 <= snap.IIliIlilll; var2++) {
         int var3 = (snap.lIliIlilll + (var2 - 1)) * 16;
         if (var3 >= 16) {
            break;
         }

         if (snap.iIliIlilll[var2] == lilIlIiiilIlIi.IlIlIlIiillIlIlIii) {
            return true;
         }
      }

      return false;
   }

   public int IIllllIlll() {
      return this.IIillillil.size();
   }
}
