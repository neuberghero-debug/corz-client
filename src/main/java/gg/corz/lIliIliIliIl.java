package gg.corz;

import java.util.Locale;

public final class lIliIliIliIl {
   public final String Iiilililliililil;
   public final String iiilililIIIiilil;
   public final long lIIiililiIIiilil;

   @Override
   public int hashCode() {
      return this.iiilililIIIiilil.hashCode() * 31 + Long.hashCode(this.lIIiililiIIiilil);
   }

   @Override
   public boolean equals(Object o) {
      if (o instanceof lIliIliIliIl var2 && var2.iiilililIIIiilil.equals(this.iiilililIIIiilil) && var2.lIIiililiIIiilil == this.lIIiililiIIiilil) {
         return true;
      }

      return false;
   }

   @Override
   public String toString() {
      return this.IIIllIIliIIl();
   }

   public IiIliliIli iliIiiliiiii(String msgSessionUuid, long msgEpoch) {
      if (msgSessionUuid == null || msgSessionUuid.isEmpty()) {
         return IiIliliIli.ilIilIIlIiIilIIl;
      } else if (!this.iiilililIIIiilil.equals(msgSessionUuid)) {
         return IiIliliIli.iiillIIlIIIilIIl;
      } else if (msgEpoch < this.lIIiililiIIiilil) {
         return IiIliliIli.lIIilIIliIIilIIl;
      } else {
         return msgEpoch > this.lIIiililiIIiilil ? IiIliliIli.IlIilIIlllIilIIl : IiIliliIli.IiillIIlliillIIl;
      }
   }

   public lIliIliIliIl(String epoch, String displayCode, long sessionUuid) {
      this.Iiilililliililil = epoch == null ? "" : epoch;
      this.iiilililIIIiilil = displayCode == null ? "" : displayCode;
      this.lIIiililiIIiilil = sessionUuid;
   }

   public static lIliIliIliIl liiiIIllIl(String displayCode, String startedAtMs, long coordinatorMemberId) {
      String var4 = (startedAtMs == null ? IlIlllIlilIl<"IlIlllIlilIl","OV6dd5mEA1aAyEdoqiJwDvynxQpf8zbvvqUdNLE=">() : startedAtMs) + '@' + coordinatorMemberId;
      return new lIliIliIliIl(displayCode, Long.toHexString((long)var4.hashCode() & 4294967295L) + '-' + Long.toHexString(coordinatorMemberId), 1L);
   }

   public static lIliIliIliIl IliIlllilIi() {
      return new lIliIliIliIl("", "", 0L);
   }

   public boolean IilliliilIIi() {
      return !this.iiilililIIIiilil.isEmpty();
   }

   public boolean lIiiIiIlilli(String msgSessionUuid, long msgEpoch) {
      return this.IilliliilIIi() && this.iiilililIIIiilil.equals(msgSessionUuid) && this.lIIiililiIIiilil == msgEpoch;
   }

   public lIliIliIliIl iIlIlllllill() {
      return new lIliIliIliIl(this.Iiilililliililil, this.iiilililIIIiilil, this.lIIiililiIIiilil + 1L);
   }

   public String IIIllIIliIIl() {
      return String.format(
         Locale.ROOT,
         IlIlllIlilIl<"IlIlllIlilIl","tdC0ibB6SQWMO1BCv+4D0XOgy4F5QZfL7s1sQinEuuk3+l+QlKHh4j/54GCK0trTqVn5RfO/Eg==">(),
         this.iiilililIIIiilil.isEmpty() ? IlIlllIlilIl<"IlIlllIlilIl","tvHe1d3F7hEDLg8hxGUNrahWWocvFaWUfiwNI9QAu5s=">() : this.iiilililIIIiilil,
         this.Iiilililliililil,
         this.lIIiililiIIiilil
      );
   }
}
