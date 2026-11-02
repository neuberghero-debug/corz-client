package gg.corz;

import java.util.Locale;

public record lIIlIIIliIIlIIIl(
   String jobId,
   String ownerId,
   long leaseGeneration,
   long assignmentEpoch,
   llllilllilllilll state,
   long lastHeartbeatMs,
   long lastProgressMs,
   int inFlightActions
) {
   private final long lIIlliIlIl;
   private final long IIIlliIlIl;
   private final long llIlliIlIl;
   private final String iiiIliIlIl;
   private final llllilllilllilll iIIlliIlIl;
   private final int ilIlliIlIl;
   private final long IlIlliIlIl;
   private final String liiIliIlIl;

   public long Iiilliiliiil() {
      return this.IlIlliIlIl;
   }

   public llllilllilllilll Ililllililil() {
      return this.iIIlliIlIl;
   }

   public long IIillIiliIil() {
      return this.lIIlliIlIl;
   }

   public long IIIilIIiiIIi() {
      return this.llIlliIlIl;
   }

   public lIIlIIIliIIlIIIl(
      String jobId,
      String ownerId,
      long leaseGeneration,
      long assignmentEpoch,
      llllilllilllilll state,
      long lastHeartbeatMs,
      long lastProgressMs,
      int inFlightActions
   ) {
      this.liiIliIlIl = jobId;
      this.iiiIliIlIl = ownerId;
      this.IIIlliIlIl = leaseGeneration;
      this.lIIlliIlIl = assignmentEpoch;
      this.iIIlliIlIl = state;
      this.IlIlliIlIl = lastHeartbeatMs;
      this.llIlliIlIl = lastProgressMs;
      this.ilIlliIlIl = inFlightActions;
   }

   public boolean iIlIlllllill() {
      return this.iIIlliIlIl == llllilllilllilll.iIIIiIlill || this.iIIlliIlIl == llllilllilllilll.IlIIiIlill;
   }

   public String IIlllIlliIll() {
      return this.liiIliIlIl;
   }

   public boolean liiiIIllIl(String epoch, long member, long gen) {
      return this.IliIlllilIi(epoch)
         && this.IIIlliIlIl == member
         && this.lIIlliIlIl == gen
         && (this.iIIlliIlIl == llllilllilllilll.iIIIiIlill || this.iIIlliIlIl == llllilllilllilll.IlIIiIlill);
   }

   public long Iilllilliill() {
      return this.IIIlliIlIl;
   }

   public boolean IliIlllilIi(String member) {
      return this.iiiIliIlIl != null && this.iiiIliIlIl.equals(member);
   }

   public boolean IilliliilIIi(long nowMs, long heartbeatTimeoutMs) {
      if (this.iIIlliIlIl == llllilllilllilll.IiIIiIlill || this.iIIlliIlIl == llllilllilllilll.liIIiIlill) {
         return false;
      } else if (this.iIIlliIlIl == llllilllilllilll.llIIiIlill) {
         return false;
      } else {
         return this.ilIlliIlIl > 0 ? false : nowMs - this.IlIlliIlIl > heartbeatTimeoutMs;
      }
   }

   public lIIlIIIliIIlIIIl lIiiIiIlilli(llllilllilllilll s) {
      return new lIIlIIIliIIlIIIl(this.liiIliIlIl, this.iiiIliIlIl, this.IIIlliIlIl, this.lIIlliIlIl, s, this.IlIlliIlIl, this.llIlliIlIl, this.ilIlliIlIl);
   }

   public lIIlIIIliIIlIIIl IIIllIIliIIl(String newOwner, long nowMs, long assignmentEpoch) {
      return new lIIlIIIliIIlIIIl(
         this.liiIliIlIl,
         newOwner,
         this.IIIlliIlIl + 1L,
         nowMs,
         newOwner == null ? llllilllilllilll.lIIIiIlill : llllilllilllilll.iIIIiIlill,
         assignmentEpoch,
         assignmentEpoch,
         0
      );
   }

   public lIIlIIIliIIlIIIl iliIiiliiiii() {
      return this.lIiiIiIlilli(llllilllilllilll.liIIiIlill);
   }

   public int IlIillIiilIi() {
      return this.ilIlliIlIl;
   }

   public String IiIlliIliiIl() {
      return String.format(
         Locale.ROOT,
         IiIiliIiiiIi<"IiIiliIiiiIi","F2gfUmeFBtsEfKybXbCCOIMw66z+nKE51jP/AwRMZQNNuNjLgL8w1qZ5Hh7sU8qkyGAsMSGEE+pbjlgpp8Pm5FzVajcpXomo9sJNvJx5UCglrdDRE2DDRUuyhaRc86alig==">(),
         this.liiIliIlIl,
         this.iiiIliIlIl == null ? IiIiliIiiiIi<"IiIiliIiiiIi","cZjnThlFAAHN87jSuvdYvJ30/+PHP3VkGkl3ukVBNPc=">() : this.iiiIliIlIl,
         this.IIIlliIlIl,
         this.lIIlliIlIl,
         this.iIIlliIlIl,
         this.ilIlliIlIl
      );
   }

   public static lIIlIIIliIIlIIIl IlIlllIlilIl(String jobId) {
      return new lIIlIIIliIIlIIIl(jobId, null, 0L, 0L, llllilllilllilll.lIIIiIlill, 0L, 0L, 0);
   }

   public String Illlllllilll() {
      return this.iiiIliIlIl;
   }
}
