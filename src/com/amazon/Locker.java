package com.amazon;


import java.util.UUID;
//Create these objects: Locker, Location, Package, User, Order, Shipment
//
//        Amazon warehouse packages Orders into a Shipment with one or more Packages.
//        Insert created Package(s) into a database and associate them with a Shipment. Associate Shipment with Order, Associate Order with User.
//        Guarantee that the length, width, and height of each Package cannot exceed the largest Locker's length, width, and height.
//        (Closest Locker Problem) Find closest Location of lockers to the Package's destination Location. Check that the Location has a volume of Locker spaces greater than or equal to the Package volume (we only need to check volume because step 3 constrains the dimensions). If not, find second closest Locker Location, and so on and so forth.
//        (Fitting Problem) Lockers have a set number of sizes (say small, medium, and large). Now, design an algorithm to fit Packages volume into Locker volume, so that minimum amount of Lockers are used. This is easily imagined as a recursive algorithm where you continuously solve for the remaining Packages until the Packages are all fit into Lockers. Each time you fit a package, you return a list of available boxes (remaining spaces in the locker in terms of boxes for that single Locker). If there are no boxes that fit the remaining packages, look for another Locker for the rest of the packages. This method will return the list of Lockers used for the Shipment.
//        Once we know the Packages can be stored at a Locker Location, return the used Locker's Locker IDs and Password to the user (delivery person, recipient, etc).
public class Locker {
////    public LockerType type;
////    public UUID LockerId;
////
////
////
////    public enum LockerType{
////        small, medium, large;
////    }
//public enum LockerSize
//{
//    Small,
//    Medium,
//    Large
//}
//    public enum PackageSize
//    {
//        Small,
//        Medium,
//        Large
//    }
//    public class Locker
//    {
//        public int LocationID
//        {
//            get;
//            set;
//        }
//        public int LockerId
//        {
//            get;
//            set;
//        }
//        public int RackRow
//        {
//            get;
//            set;
//        }
//        public int RackCol
//        {
//            get;
//            set;
//        }
//        public LockerSize Size
//        {
//            get;
//            set;
//        }
//        public Locker(LockerSize size)
//        {
//            this.Size = size;
//        }
//    }
//    public class LockerHubManager
//    {
//        private int SamllLockerCount
//        {
//            get;
//            set;
//        }
//        private int MediumLockerCount
//        {
//            get;
//            set;
//        }
//        private int LargeLockerCount
//        {
//            get;
//            set;
//        }
//        private Dictionary<LockerSize, Queue<Locker>> AvailableLockers
//        {
//            get;
//            set;
//        }
//        private Dictionary<LockerSize, Queue<Locker>> AssignLockers
//        {
//            get;
//            set;
//        }
//        private Dictionary<LockerSize, int> LockerCounts
//        {
//            get;
//            set;
//        }
//        public LockerHubManager(int smallCount, int mediumCount, int largeCount)
//        {
//            this.SamllLockerCount = smallCount;
//            this.MediumLockerCount = mediumCount;
//            this.LargeLockerCount = largeCount;
//
//            this.LockerCounts.Add(LockerSize.Small, smallCount);
//            this.LockerCounts.Add(LockerSize.Medium, mediumCount);
//            this.LockerCounts.Add(LockerSize.Large, largeCount);
//            this.Init();
//        }
//        private void Init()
//        {
//            this.AvailableLockers.Add(LockerSize.Small, new Queue<Locker>());
//            this.AvailableLockers.Add(LockerSize.Medium, new Queue<Locker>());
//            this.AvailableLockers.Add(LockerSize.Large, new Queue<Locker>());
//
//            this.AssignLockers.Add(LockerSize.Small, new Queue<Locker>());
//            this.AssignLockers.Add(LockerSize.Medium, new Queue<Locker>());
//            this.AssignLockers.Add(LockerSize.Large, new Queue<Locker>());
//
//            for (int i = 0; i < this.SamllLockerCount; i++)
//            {
//                var locker = new Locker(LockerSize.Small);
//                this.AvailableLockers[LockerSize.Small].Enqueue(locker);
//            }
//            for (int i = 0; i < this.MediumLockerCount; i++)
//            {
//                var locker = new Locker(LockerSize.Medium);
//                this.AvailableLockers[LockerSize.Medium].Enqueue(locker);
//            }
//            for (int i = 0; i < this.LargeLockerCount; i++)
//            {
//                var locker = new Locker(LockerSize.Large);
//                this.AvailableLockers[LockerSize.Large].Enqueue(locker);
//            }
//        }
//        public bool AssignLocker(PackageSize pSize)
//        {
//            if (this.LockerCounts[(LockerSize)pSize] > 0)
//            {
//                var locker = this.AvailableLockers[(LockerSize)pSize].Dequeue();
//                this.AssignLockers[(LockerSize)pSize].Enqueue(locker);
//                this.LockerCounts[(LockerSize)pSize]--;
//            }
//            return false;
//        }
//    }
////

}
