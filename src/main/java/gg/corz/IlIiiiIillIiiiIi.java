package gg.corz;

import java.util.HashMap;
import java.util.function.LongSupplier;
import java.util.function.LongUnaryOperator;

public final class IlIiiiIillIiiiIi {
   public long illilIIlIi;
   public long IIiilIIlIi;
   public long IililIIlIi;
   public long lIiilIIlIi;
   public long lllilIIlIi;
   public long lililIIlIi;
   public long iIiilIIlIi;
   private final HashMap<Long, Boolean> iIlilIIlIi;
   private static final int IIlilIIlIi = 512;
   private final HashMap<Long, iIiiliiIliilii> lIlilIIlIi = new HashMap<>();
   public long iililIIlIi;
   private long IllilIIlIi;

   public boolean IIlllIlliIll(long stateOf, long mode, IIlIiiIilIlIiiIi stand, LongSupplier fingerprintNow, LongUnaryOperator target) {
      if (this.IlIlllIlilIl(IliIlllilIi(stateOf, mode, stand), fingerprintNow, target) == null) {
         return false;
      } else {
         this.IIiilIIlIi++;
         return true;
      }
   }

   public void IIIllIIliIIl(long cells, long certificateId, IIlIiiIilIlIiiIi fingerprint, long mode, String stand, long reason, long[] target) {
      if (this.lIlilIIlIi.size() >= 512) {
         this.lIlilIIlIi.clear();
         this.iIlilIIlIi.clear();
      }

      long var12 = IliIlllilIi(cells, certificateId, fingerprint);
      this.lIlilIIlIi.put(var12, new iIiiliiIliilii(cells, certificateId, fingerprint, mode, stand, reason, target));
      this.iIlilIIlIi.remove(var12);
      this.iililIIlIi++;
   }

   public iIiiliiIliilii IIillIiliIil(long mode, long stand, IIlIiiIilIlIiiIi target, LongSupplier fingerprintNow) {
      return this.IlIlllIlilIl(IliIlllilIi(mode, stand, target), fingerprintNow, null);
   }

   public String IiIiliIiiiIi() {
      return IIlilIliiIli<"IIlilIliiIli","lED0miSWYbQQYkDCRj0KqCjgjSdm1vCjBqtMtZMQNZAdpEO6erf9Tc5aoOmpMg==">()
         + this.lllilIIlIi
         + IIlilIliiIli<"IIlilIliiIli","Ddf2CP5cki2Tji4c18JVeyPO9QKcroxV0KQ28KLQpckI0X3k+X/9Kf7X3FCFMy3XE1ZbvCls">()
         + this.illilIIlIi
         + IIlilIliiIli<"IIlilIliiIli","XrsYXQVg5xqgrp1We6NL112eiR/mYQS1OB3mjLii0WBbz8XlRETMf6OwjFVKOJQgqaVOItw=">()
         + this.IililIIlIi
         + IIlilIliiIli<"IIlilIliiIli","eSiqIGrQvcgNZacLu2CsAwJCDWk9KtQNWziVTrPSkkrhExL80qwxmRovHV6u8QAGOg==">()
         + this.lililIIlIi
         + IIlilIliiIli<"IIlilIliiIli","5Yc2eWh+9guvw5GnJZnqrDyjiF9l0MBAwiIZMjYURfGZTW7QxjpiF8Z/pGbNy32wx8ULyojZuh0kDu8=">()
         + this.iililIIlIi
         + IIlilIliiIli<"IIlilIliiIli","18Lt/cHt0aoVHIYIEdx2rmEbBGcxugba0/YVFMjbb54wBhAagH4Sr3qJG5MVVURDcnE=">()
         + this.IIiilIIlIi
         + IIlilIliiIli<"IIlilIliiIli","8vgtP53oWNVl2+qGaDUDRNSWCjFbnck7dlnVrbKO9W99gYVZB1zUs6rd2l5gOA==">()
         + this.lIlilIIlIi.size()
         + IIlilIliiIli<"IIlilIliiIli","0/8nbEJvRJmfC6r+PKKTEhSznlPxzinGYGntdG2igUHjUFWGUX/CJRbXkdyaqNhP9rQ=">()
         + this.lIiilIIlIi
         + IIlilIliiIli<"IIlilIliiIli","brgJUJBAcZZYu26O9nYI1JldonY9DwvncePheF0LJTX5tWR7mTjBy7zANwnNknBCmp+vok6l00n7">()
         + this.iIiilIIlIi;
   }

   public void lIiiIiIlilli(IiIilillliIilill reason, String cert) {
      this.lililIIlIi++;
      this.iliIiiliiiii(reason.IIillIiliIil(), reason.Ililllililil(), reason.Iiilliiliiil(), reason.IIiilIiiiIii(), cert, reason.Iilllilliill());
   }

   public static long IliIlllilIi(long target, long stand, IIlIiiIilIlIiiIi mode) {
      return target * -7046029254386353131L ^ Long.rotateLeft(stand * -4417276706812531889L, 21) ^ ((long)mode.ordinal() + 1L) * 1609587929392839161L;
   }

   public void iIlIlllllill() {
      this.illilIIlIi++;
   }

   public boolean Illlllllilll(long fingerprintNow, long stand, LongSupplier target) {
      return this.Iilllilliill(fingerprintNow, stand, target, null);
   }

   public void IilliliilIIi() {
      this.IililIIlIi++;
   }

   private iIiiliiIliilii IlIlllIlilIl(long k, LongSupplier fingerprintNow, LongUnaryOperator stateOf) {
      iIiiliiIliilii var5 = this.lIlilIIlIi.get(k);
      if (var5 == null) {
         return null;
      } else {
         long var6 = var5.IIIllIIliIIl() != null && stateOf != null ? iIliiIiIlliiIi.IliIlllilIi(var5.IIIllIIliIIl(), stateOf) : fingerprintNow.getAsLong();
         if (var5.IilliliilIIi() != var6) {
            this.lIlilIIlIi.remove(k);
            this.iIlilIIlIi.remove(k);
            return null;
         } else {
            return var5;
         }
      }
   }

   public iIiiliiIliilii Ililllililil(long fingerprintNow, long stand, IIlIiiIilIlIiiIi mode, LongSupplier stateOf, LongUnaryOperator target) {
      return this.IlIlllIlilIl(IliIlllilIi(fingerprintNow, stand, mode), stateOf, target);
   }

   public long liiiIIllIl() {
      this.lllilIIlIi++;
      return this.IllilIIlIi++;
   }

   public boolean Iiilliiliiil(long target, long stand, IIlIiiIilIlIiiIi mode) {
      return this.iIlilIIlIi.putIfAbsent(IliIlllilIi(target, stand, mode), Boolean.TRUE) == null;
   }

   public int IIIilIIiiIIi() {
      return this.lIlilIIlIi.size();
   }

   public void IlIillIiilIi() {
      this.lIlilIIlIi.clear();
      this.iIlilIIlIi.clear();
   }

   public IlIiiiIillIiiiIi() {
      this.iIlilIIlIi = new HashMap<>();
      this.IllilIIlIi = 1L;
   }

   public boolean IiIlliIliiIl(long target, long fingerprintNow, IIlIiiIilIlIiiIi mode, LongSupplier stand) {
      return this.IIlllIlliIll(target, fingerprintNow, mode, stand, null);
   }

   public boolean Iilllilliill(long stand, long target, LongSupplier stateOf, LongUnaryOperator fingerprintNow) {
      long var8 = 4829675877948064799L;
      var8 ^= (
            (long)(
                     this.IlIlllIlilIl(IliIlllilIi(stand, target, IIlIiiIilIlIiiIi.lllIiiiIIi), stateOf, fingerprintNow) != null
                           && this.IlIlllIlilIl(IliIlllilIi(stand, target, IIlIiiIilIlIiiIi.illIiiiIIi), stateOf, fingerprintNow) != null
                        ? 1
                        : 0
                  )
                  << 32
               ^ var8
         )
         & -1L << 32;
      if ((int)(var8 >>> 32) != 0) {
         this.IIiilIIlIi++;
      }

      return (boolean)((int)(var8 >>> 32));
   }

   public void iliIiiliiiii(long stand, long target, IIlIiiIilIlIiiIi certificateId, long fingerprint, String reason, long mode) {
      this.IIIllIIliIIl(stand, target, certificateId, fingerprint, reason, mode, null);
   }
}
