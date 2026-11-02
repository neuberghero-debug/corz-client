package gg.corz;

import net.minecraft.class_1799;

record IIlllilIllli(
   long sentMs,
   String kind,
   int srcInv,
   int tgtInv,
   int srcHandlerSlot,
   int tgtHandlerSlot,
   class_1799 srcBefore,
   class_1799 tgtBefore,
   int srcSeqAtSend,
   int tgtSeqAtSend,
   long fullSyncSeqAtSend
) {
   private final long iilIIIlIlIIiIIIlIl;
   private final int IilIIIlIllilIIIlIl;
   private final int IlIIIIlIlllIIIIlIl;
   private final int lllIIIlIlillIIIlIl;
   private final int ilIIIIlIlIiIIIIlIl;
   private final class_1799 IIlIIIlIllIlIIIlIl;
   private final class_1799 iIlIIIlIlIllIIIlIl;
   private final int liIIIIlIliiIIIIlIl;
   private final long IiiiiiIIlliiiiiIIl;
   private final int lIIIIIlIliIIIIIlIl;
   private final String iiiiiiIIlIIIIIIlIl;

   public long Illlllllilll() {
      return this.iilIIIlIlIIiIIIlIl;
   }

   public class_1799 IIIllIIliIIl() {
      return this.IIlIIIlIllIlIIIlIl;
   }

   public class_1799 IlIlllIlilIl() {
      return this.iIlIIIlIlIllIIIlIl;
   }

   public int lIiiIiIlilli() {
      return this.ilIIIIlIlIiIIIIlIl;
   }

   public String liiiIIllIl() {
      return this.iiiiiiIIlIIIIIIlIl;
   }

   public int iliIiiliiiii() {
      return this.liIIIIlIliiIIIIlIl;
   }

   public int IIlllIlliIll() {
      return this.IilIIIlIllilIIIlIl;
   }

   private IIlllilIllli(
      long sentMs,
      String kind,
      int srcInv,
      int tgtInv,
      int srcHandlerSlot,
      int tgtHandlerSlot,
      class_1799 srcBefore,
      class_1799 tgtBefore,
      int srcSeqAtSend,
      int tgtSeqAtSend,
      long fullSyncSeqAtSend
   ) {
      this.IiiiiiIIlliiiiiIIl = sentMs;
      this.iiiiiiIIlIIIIIIlIl = kind;
      this.lIIIIIlIliIIIIIlIl = srcInv;
      this.IlIIIIlIlllIIIIlIl = tgtInv;
      this.ilIIIIlIlIiIIIIlIl = srcHandlerSlot;
      this.liIIIIlIliiIIIIlIl = tgtHandlerSlot;
      this.IIlIIIlIllIlIIIlIl = srcBefore;
      this.iIlIIIlIlIllIIIlIl = tgtBefore;
      this.lllIIIlIlillIIIlIl = srcSeqAtSend;
      this.IilIIIlIllilIIIlIl = tgtSeqAtSend;
      this.iilIIIlIlIIiIIIlIl = fullSyncSeqAtSend;
   }

   public int IilliliilIIi() {
      return this.IlIIIIlIlllIIIIlIl;
   }

   public int IiIlliIliiIl() {
      return this.lllIIIlIlillIIIlIl;
   }

   public long IliIlllilIi() {
      return this.IiiiiiIIlliiiiiIIl;
   }

   public int iIlIlllllill() {
      return this.lIIIIIlIliIIIIIlIl;
   }
}
