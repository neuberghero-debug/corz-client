package gg.corz;

import java.nio.CharBuffer;
import java.security.SecureRandom;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

public class IllIIllllllIIlll implements CharSequence, AutoCloseable {
   private final char[] Iiliiiilll;
   private boolean IIiiiiilll = false;
   private final char[] liliiiilll;
   private static final SecureRandom illiiiilll = new SecureRandom();
   private final int iiliiiilll;

   @NotNull
   public String lIiiIiIlilli() {
      this.IIIllIIliIIl();
      return this.toString();
   }

   @Override
   public int hashCode() {
      long var3 = 547583149039587398L;
      this.IIIllIIliIIl();
      var3 ^= (0L ^ var3) & -1L << 32;
      var3 ^= (0L ^ var3) & -1L >>> 32;

      while ((int)var3 < this.iiliiiilll) {
         var3 ^= ((long)(31 * (int)(var3 >>> 32) + this.charAt((int)var3)) << 32 ^ var3) & -1L << 32;
         var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32;
      }

      return (int)(var3 >>> 32);
   }

   private void IIIllIIliIIl() {
      if (this.IIiiiiilll) {
         throw new IllegalStateException(
            IlIlllIlilIl<"IlIlllIlilIl","FlSbnLT1LlrOdwOMljpm26gtMb/p09GlJCXvSX6AtX12VX7htrIR4a93DBpBzo20rEhxdz2O2WPzQLURMx76kGmXCm9r+AyD4h1mJOPklit0w38=">()
         );
      }
   }

   public static IllIIllllllIIlll IliIlllilIi(String s) {
      return new IllIIllllllIIlll(s);
   }

   public IllIIllllllIIlll(char[] original, char[] original2) {
      if (original == null || original2 == null) {
         throw new IllegalArgumentException(
            IlIlllIlilIl<"IlIlllIlilIl","IMASLQeplJDUnddZ5YHqNwEnjCmeyCwS78yx3Qt0zr+VggfqyL6csGDwx3EVEKJ4AyLPWBhZV3Ll4x9yB6fmsrsnPN2Dyaw=">()
         );
      } else if (original2.length == 0) {
         throw new IllegalArgumentException(IlIlllIlilIl<"IlIlllIlilIl","/di5Xq7pz18tS3qwvIYvL7lUVa+u7N5RRSmDYSIT4NdYJIhNX0swp+YvpGCmILmGsfCIGjqzs9glkA==">());
      } else {
         this.iiliiiilll = original.length;
         this.liliiiilll = Arrays.copyOf(original, original.length);
         this.Iiliiiilll = Arrays.copyOf(original2, original2.length);
      }
   }

   public CharBuffer iliIiiliiiii() {
      long var3 = -2010733045326530934L;
      this.IIIllIIliIIl();
      CharBuffer var1 = CharBuffer.allocate(this.iiliiiilll);

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.iiliiiilll; var5 += 4294967296L) {
         var1.put((int)(var5 >>> 32), this.charAt((int)(var5 >>> 32)));
      }

      var1.flip();
      return var1.asReadOnlyBuffer();
   }

   @Override
   public boolean equals(Object o) {
      long var3 = 2400275622931706877L;
      this.IIIllIIliIIl();
      if (this == o) {
         return true;
      } else if (!(o instanceof CharSequence)) {
         return false;
      } else if (this.iiliiiilll != ((CharSequence)o).length()) {
         return false;
      } else {
         for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.iiliiiilll; var5 += 4294967296L) {
            if (this.charAt((int)(var5 >>> 32)) != ((CharSequence)o).charAt((int)(var5 >>> 32))) {
               return false;
            }
         }

         return true;
      }
   }

   @NotNull
   @Override
   public CharSequence subSequence(int n2, int n) {
      long var7 = 2424222539166086246L;
      this.IIIllIIliIIl();
      if (n2 >= 0 && n <= this.iiliiiilll && n2 <= n) {
         var7 ^= ((long)(n - n2) << 32 ^ var7) & -1L << 32;
         char[] var4 = new char[(int)(var7 >>> 32)];
         System.arraycopy(this.liliiiilll, n2, var4, 0, (int)(var7 >>> 32));
         char[] var5 = new char[(int)(var7 >>> 32)];

         for (var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < (int)(var7 >>> 32); var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            var5[(int)var7] = this.Iiliiiilll[(n2 + (int)var7) % this.Iiliiiilll.length];
         }

         IilliliilIIi(var4, this.Iiliiiilll, 0, (int)(var7 >>> 32));
         IilliliilIIi(var4, var5, 0, (int)(var7 >>> 32));
         return new IllIIllllllIIlll(var4, var5);
      } else {
         throw new IndexOutOfBoundsException(
            IlIlllIlilIl<"IlIlllIlilIl","z4UH8QPstyfMB/BwpzYqBryB+BGc9gSMk9hLwlZAPCAawyt79+ToULTcF0xlpRIg9SXxpyOgCg==">()
               + n2
               + IlIlllIlilIl<"IlIlllIlilIl","3vre5BaEatSAEfBrR/9CrHDbnxP9ZwpIMz5bmyua75Y=">()
               + n
               + IlIlllIlilIl<"IlIlllIlilIl","XymZExNT4+a/5x/xNYNArbDIz4HXvq0tHVR5RVimP2AdL97w87w=">()
               + this.iiliiiilll
         );
      }
   }

   @Override
   public int length() {
      this.IIIllIIliIIl();
      return this.iiliiiilll;
   }

   @Override
   public void close() {
      if (!this.IIiiiiilll) {
         Arrays.fill(this.liliiiilll, '\u0000');
         Arrays.fill(this.Iiliiiilll, '\u0000');
         this.IIiiiiilll = true;
      }
   }

   @Override
   public char charAt(int n) {
      this.IIIllIIliIIl();
      if (n >= 0 && n < this.iiliiiilll) {
         return (char)(this.liliiiilll[n] ^ this.Iiliiiilll[n % this.Iiliiiilll.length]);
      } else {
         throw new IndexOutOfBoundsException(
            IlIlllIlilIl<"IlIlllIlilIl","v8U0m4+vtDqIv97CBujlzl11Y4ZXtCgfN0aQ/Rm7Q3O1MDE=">()
               + n
               + IlIlllIlilIl<"IlIlllIlilIl","+adnad07uDlkiWbBg1N+Exd0OdDUqcSQcNU2M2DnH3QeWWEawps=">()
               + this.iiliiiilll
         );
      }
   }

   public static IllIIllllllIIlll liiiIIllIl(String s, String s2) {
      if (s != null && s2 != null) {
         return new IllIIllllllIIlll(s.toCharArray(), s2.toCharArray());
      } else {
         throw new IllegalArgumentException(
            IlIlllIlilIl<"IlIlllIlilIl","eotaVfMmMlBCiqN2D8b1DAkpCycf6wUC5YX5OAl5tn4Cv34YwGdt/UlzFtQGYpx0L+76NNpydqMLhj54hMLK5iO/eJyZLQ==">()
         );
      }
   }

   @NotNull
   @Override
   public String toString() {
      long var3 = -1810747334052347845L;
      this.IIIllIIliIIl();
      char[] var1 = new char[this.iiliiiilll];

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.iiliiiilll; var5 += 4294967296L) {
         var1[(int)(var5 >>> 32)] = this.charAt((int)(var5 >>> 32));
      }

      String var2 = new String(var1);
      Arrays.fill(var1, '\u0000');
      return var2;
   }

   private static void IilliliilIIi(char[] n, char[] array, int array2, int n2) {
      long var6 = -8082341363589825852L;
      var6 ^= (0L ^ var6) & -1L << 32;

      while ((int)(var6 >>> 32) < n2) {
         var6 ^= ((long)(array2 + (int)(var6 >>> 32)) ^ var6) & -1L >>> 32;
         n[(int)var6] = (char)(n[(int)var6] ^ array[(int)(var6 >>> 32) % array.length]);
         var6 += 4294967296L;
      }
   }

   private static char[] iIlIlllllill(int n) {
      long var3 = -1484061873934207563L;
      char[] var1 = new char[n];

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < n; var5 += 4294967296L) {
         var1[(int)(var5 >>> 32)] = (char)illiiiilll.nextInt(65536);
      }

      return var1;
   }

   public IllIIllllllIIlll(String string) {
      if (string == null) {
         throw new IllegalArgumentException(IlIlllIlilIl<"IlIlllIlilIl","R7lWx2PdrP0TRimM6xTylZUmWyJz/XFZ5fviVsl32m/qc/oV/FGBaSRO1ozhhwzaTlLQc0+QhA==">());
      } else {
         this.iiliiiilll = string.length();
         this.Iiliiiilll = iIlIlllllill(Math.min(this.iiliiiilll, 128));
         this.liliiiilll = new char[this.iiliiiilll];
         string.getChars(0, this.iiliiiilll, this.liliiiilll, 0);
         IilliliilIIi(this.liliiiilll, this.Iiliiiilll, 0, this.iiliiiilll);
      }
   }
}
