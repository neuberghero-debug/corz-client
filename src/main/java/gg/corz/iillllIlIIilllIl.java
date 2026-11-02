package gg.corz;

public record iillllIlIIilllIl<K>(
   K material,
   int requiredTotal,
   int alreadyPlaced,
   int remainingRequired,
   int playerInventoryCount,
   int restockStoredCount,
   int trueDeficit,
   int maxStackSize,
   int requiredAdditionalSlots
) {
   private final K IliiiiIiIl;
   private final int lIIIIIliIl;
   private final int iliiiiIiIl;
   private final int iiiiiiIiIl;
   private final int IiiiiiIiIl;
   private final int iIIIIIliIl;
   private final int liiiiiIiIl;
   private final int lliiiiIiIl;
   private final int IIIIIIliIl;

   public int iliIiiliiiii() {
      return this.IiiiiiIiIl;
   }

   public int IlIlllIlilIl() {
      return this.iiiiiiIiIl;
   }

   public int IIIllIIliIIl() {
      return this.liiiiiIiIl;
   }

   public String liiiIIllIl() {
      return Iilllilliill<"Iilllilliill","qRMpQ10+c49UtKYQeq1I6Ldhs7ndnZXtVOPsvfJap9cbeYsmTQ==">()
         + this.IliiiiIiIl
         + Iilllilliill<"Iilllilliill","ZSMPfCX8cHrydqXvopG1uZAN36wqkcJuImF5kp2hUFdXPR5+CFASU2GFTw==">()
         + this.lliiiiIiIl
         + Iilllilliill<"Iilllilliill","9Rn/v2sIHzD460sdFW/+CUQcnYLx7CywVhgHgBBYqImWiKrz21LILPflOg==">()
         + this.iliiiiIiIl
         + Iilllilliill<"Iilllilliill","IA1k8k1+bf2KTQmE34ScvSH2fTylAIQ3glPV0afMQPkwpfzZJETaXUr6c5jRROc=">()
         + this.IiiiiiIiIl
         + Iilllilliill<"Iilllilliill","+vqe7bJe76++lfgGmP6xbun6X5Rm1Vu/kbw7HStnJUw7yK3dRXcVLAFXR+1msvlz61E=">()
         + this.liiiiiIiIl
         + Iilllilliill<"Iilllilliill","lUKCAqY9bzUGXu9N/zcSGS9oc6B09IKHLAA36jRbgnI6m/GWc5jHdTDkyvvT/EIm">()
         + this.iiiiiiIiIl
         + Iilllilliill<"Iilllilliill","sq4L9WK3JXYvo4AvV6L56shqueEVhJrUWayWUgHKCHRFyztJ16dcM7E=">()
         + this.IIIIIIliIl
         + Iilllilliill<"Iilllilliill","2qJVd7hHlRCDG2Gs8bIr1O2yADf6Cm2JMiwGaNmUuNYiOwjpGfqB0bBZ">()
         + this.lIIIIIliIl
         + Iilllilliill<"Iilllilliill","VyOrwXCeps5kVkFs4kev3PGjyr2ZwFh5ghYiiaVsz7Aurg10xZ/ypCNWelRroXsJZt5j6ts=">()
         + this.iIIIIIliIl;
   }

   public iillllIlIIilllIl(
      K material,
      int requiredTotal,
      int alreadyPlaced,
      int remainingRequired,
      int playerInventoryCount,
      int restockStoredCount,
      int trueDeficit,
      int maxStackSize,
      int requiredAdditionalSlots
   ) {
      this.IliiiiIiIl = (K)material;
      this.lliiiiIiIl = requiredTotal;
      this.iliiiiIiIl = alreadyPlaced;
      this.IiiiiiIiIl = remainingRequired;
      this.liiiiiIiIl = playerInventoryCount;
      this.iiiiiiIiIl = restockStoredCount;
      this.IIIIIIliIl = trueDeficit;
      this.lIIIIIliIl = maxStackSize;
      this.iIIIIIliIl = requiredAdditionalSlots;
   }

   public static <K> iillllIlIIilllIl<K> IliIlllilIi(K inventory, int maxStack, int stored, int material, int alreadyPlaced, int requiredTotal) {
      long var10 = 495158199748208624L;
      long var12 = 3766324681365775926L;
      var10 ^= ((long)Math.max(0, maxStack - stored) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)Math.max(0, (int)(var10 >>> 32) - Math.max(0, material) - Math.max(0, alreadyPlaced)) ^ var10) & -1L >>> 32;
      var12 ^= ((long)Math.max(1, requiredTotal) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(((int)var10 + (int)(var12 >>> 32) - 1) / (int)(var12 >>> 32)) ^ var12) & -1L >>> 32;
      return new iillllIlIIilllIl<>(
         (K)inventory, maxStack, stored, (int)(var10 >>> 32), Math.max(0, material), Math.max(0, alreadyPlaced), (int)var10, (int)(var12 >>> 32), (int)var12
      );
   }

   public int IilliliilIIi() {
      return this.lliiiiIiIl;
   }

   public int Illlllllilll() {
      return this.iIIIIIliIl;
   }

   public int IiIlliIliiIl() {
      return this.IIIIIIliIl;
   }

   public int IIlllIlliIll() {
      return this.lIIIIIliIl;
   }

   public int lIiiIiIlilli() {
      return this.iliiiiIiIl;
   }

   public K iIlIlllllill() {
      return this.IliiiiIiIl;
   }
}
